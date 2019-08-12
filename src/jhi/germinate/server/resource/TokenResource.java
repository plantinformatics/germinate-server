/*
 * Copyright 2018 Information & Computational Sciences, The James Hutton Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jhi.germinate.server.resource;

import org.restlet.data.Status;
import org.restlet.resource.*;

import java.io.*;
import java.util.*;

import jhi.gatekeeper.resource.*;
import jhi.gatekeeper.server.database.tables.pojos.*;
import jhi.germinate.resource.Token;
import jhi.germinate.resource.*;
import jhi.germinate.server.*;
import jhi.germinate.server.auth.*;
import jhi.germinate.server.gatekeeper.*;
import retrofit2.*;

/**
 * {@link ServerResource} handling {@link TokenResource} requests.
 *
 * @author Sebastian Raubach
 */
public class TokenResource extends ServerResource
{
	public static Integer SALT = 10;

	@Delete("json")
	public boolean deleteJson(LoginDetails user)
	{
		if (user == null)
			throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND, StatusMessage.NOT_FOUND_TOKEN);

		CustomVerifier.UserDetails sessionUser = CustomVerifier.getFromSession(getRequest());

		if (sessionUser == null || !Objects.equals(sessionUser.getToken(), user.getPassword()))
			throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_ACCESS_TO_OTHER_USER);

		try
		{
			// Try and see if it's a valid UUID
			UUID.fromString(user.getPassword());
			return CustomVerifier.removeToken(user.getPassword());
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Post("json")
	public Token postJson(LoginDetails request)
	{
		boolean canAccess = false;
		boolean isAdmin = false;

		Users user = new Users();
		user.setUsername(request.getUsername());
		user.setPassword(request.getPassword());
		try
		{
			Response<jhi.gatekeeper.resource.Token> response = GatekeeperClient.get().postToken(user).execute();
			jhi.gatekeeper.resource.Token token = response.body();

			if (response.isSuccessful() && token != null)
			{
				user.setId(token.getId());
				Response<PaginatedResult<List<ViewUserPermissions>>> permissions = GatekeeperClient.get().getUserPermissions(token.getId(), Database.getDatabaseServer(), Database.getDatabaseName(), 0, Integer.MAX_VALUE).execute();

				if (permissions.isSuccessful() && permissions.body() != null)
				{
					Optional<String> userType = permissions.body().getData().stream()
														   .map(ViewUserPermissions::getUserType)
														   .filter(p -> !Objects.equals(p, "Suspended User"))
														   .findFirst();

					if (userType.isPresent())
					{
						canAccess = true;
						isAdmin = Objects.equals(userType.get(), "Administrator");
					}
				}
				else
				{
					throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
				}
			}
			else
			{
				throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_INVALID_CREDENTIALS);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_INVALID_CREDENTIALS);
		}

		String token;

		if (canAccess)
		{
			token = UUID.randomUUID().toString();
			CustomVerifier.addToken(getResponse(), token, isAdmin, user.getId());
		}
		else
		{
			throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, StatusMessage.FORBIDDEN_INVALID_CREDENTIALS);
		}

		return new Token(token, user.getId(), user.getUsername(), user.getFullName(), user.getEmailAddress(), isAdmin, CustomVerifier.AGE, System.currentTimeMillis());
	}
}
