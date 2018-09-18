package com.newjava4world.rest.tokenbasedauth;

public interface UsersService {
    public UserProfileDto saveUser(UserProfileDto user) throws UserServiceException;

	public UserProfileDto getUserProfileByPublicId(String userId);
}
