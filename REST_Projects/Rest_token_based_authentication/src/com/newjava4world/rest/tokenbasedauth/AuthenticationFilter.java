package com.newjava4world.rest.tokenbasedauth;

import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Component;
/**
 *
 * @author skargopolov
 */
@Component
@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {
    @Autowired
    UsersService usersService;
    @Autowired
    AuthenticationUtil authenticationUtil;
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        // Extract Authorization header details
        String authorizationHeader
                = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }
        // Extract the token
        String token = authorizationHeader.substring("Bearer".length()).trim();
        // Extract user id
        String userId = requestContext.getUriInfo().getPathParameters().getFirst("id");
        try {
            // Validate the token
         //   validateToken(token, userId);
        } catch (AuthenticationServiceException ex) {
            Logger.getLogger(AuthenticationFilter.class.getName()).log(Level.SEVERE, null, ex);
            requestContext.abortWith(
                    Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }
    private void validateToken(String token, String userId) throws AuthenticationServiceException, AuthenticationException {
        // Get user profile details
        UserProfileDto userProfile = usersService.getUserProfileByPublicId(userId);
        String completeToken = userProfile.getToken() + token;
        String securePassword = userProfile.getUserPassword();
        String salt = userProfile.getSalt();
        String accessTokenMaterial = userId + salt;
        byte[] encryptedAccessToken = null;
        try {
            encryptedAccessToken = authenticationUtil.encrypt(securePassword, accessTokenMaterial);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(AuthenticationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new AuthenticationException("Faled to issue secure access token");
        }
        String encryptedAccessTokenBase64Encoded = Base64.getEncoder().encodeToString(encryptedAccessToken);
        if (!encryptedAccessTokenBase64Encoded.equalsIgnoreCase(completeToken)) {
            throw new AuthenticationServiceException("Authorization token did not match");
        }
    }
    
    
}