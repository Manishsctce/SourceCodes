package com.newjava4world.rest.tokenbasedauth;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author skargopolov
 */
@Component
@Path("/users")
public class Users {

	@Autowired
	UsersService usersService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public UserProfileResponse createUserProfile(UserProfile userProfile) throws UserServiceException {

		UserProfileResponse returnValue = null;

		UserProfileDto userProfileDto = new UserProfileDto();
		BeanUtils.copyProperties(userProfile, userProfileDto);

		UserProfileDto storedUserDetails = usersService.saveUser(userProfileDto);

		if(storedUserDetails != null && !storedUserDetails.getFirstName().isEmpty())
		{
			returnValue = new UserProfileResponse();
			BeanUtils.copyProperties(storedUserDetails, returnValue);
		}

		// And when we are done, we can return user profile back
		return returnValue;
	}


	@GET
	@Secured
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public UserProfileResponse getUserProfile(@PathParam("id") String userId) {
		UserProfileResponse userProfileResponse = null;
		UserProfileDto storedUserDetails = usersService.getUserProfileByPublicId(userId);
		if (storedUserDetails != null) {
			userProfileResponse = new UserProfileResponse();
			BeanUtils.copyProperties(storedUserDetails, userProfileResponse);
		}
		return userProfileResponse;

	}
}