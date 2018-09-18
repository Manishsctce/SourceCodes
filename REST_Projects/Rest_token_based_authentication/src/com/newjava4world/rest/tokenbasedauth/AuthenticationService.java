package com.newjava4world.rest.tokenbasedauth;

import org.springframework.security.core.AuthenticationException;

public interface AuthenticationService {

	UserProfileDto authenticate(String userName, String userPassword) throws AuthenticationException;

	UserProfileDto resetSecurityCridentials(String password, UserProfileDto userProfile) throws UserServiceException;

	String issueSecureToken(UserProfileDto userProfile) throws AuthenticationException;

}
