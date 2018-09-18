package com.newjava4world.rest.tokenbasedauth;
//package com.appsdeveloperblog.ws.io.dao;

public interface Database {
    public void openConnection();
    public UserProfileEntity saveUserProfile(UserProfileEntity userProfile);
    public void closeConnection();
	public UserProfileEntity updateUserProfile(UserProfileEntity userProfile);
	public UserProfileEntity getUserProfile(String userName);
}