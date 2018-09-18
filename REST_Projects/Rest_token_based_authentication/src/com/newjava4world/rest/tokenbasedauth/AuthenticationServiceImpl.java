package com.newjava4world.rest.tokenbasedauth;

import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {
 
    Database database;
    AuthenticationUtil authenticationUtil;
    
    @Autowired
    public AuthenticationServiceImpl(Database database, AuthenticationUtil authenticationUtil)
    {
        this.database = database;
        this.authenticationUtil = authenticationUtil;
    }
    @Override
    public UserProfileDto authenticate(String userName, String userPassword) throws AuthenticationException {
        UserProfileDto userProfile = new UserProfileDto();
        UserProfileEntity userEntity = getUserProfile(userName); // User name must be unique in our system
        // Here we perform authentication business logic
        // If authentication fails, we throw new AuthenticationException
        // other wise we return UserProfile Details
        String secureUserPassword = null;
        try {
            secureUserPassword = authenticationUtil.
                    generateSecurePassword(userPassword, userEntity.getSalt());
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(AuthenticationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new AuthenticationException(ex.getLocalizedMessage());
        }
        boolean authenticated = false;
        if (secureUserPassword != null && secureUserPassword.equalsIgnoreCase(userEntity.getUserPassword())) {
            if (userName != null && userName.equalsIgnoreCase(userEntity.getUserName())) {
                authenticated = true;
            }
        }
        if (!authenticated) {
            throw new AuthenticationException("Authentication failed");
        }
        BeanUtils.copyProperties(userEntity, userProfile);
        return userProfile;
    }
    @Override
    public UserProfileDto resetSecurityCridentials(String password, 
            UserProfileDto userProfile) throws UserServiceException {
        // Generate salt
        String salt = authenticationUtil.generateSalt(30);
        // Generate secure user password 
        String secureUserPassword = null;
        try {
            secureUserPassword = authenticationUtil.
                    generateSecurePassword(password, salt);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(UsersServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new UserServiceException(ex.getLocalizedMessage());
        }
        userProfile.setSalt(salt);
        userProfile.setUserPassword(secureUserPassword);
        UserProfileEntity userEntity = new UserProfileEntity();
        BeanUtils.copyProperties(userProfile, userEntity);
        // Connect to database 
        try {
            this.database.openConnection();
            this.database.updateUserProfile(userEntity);
        } finally {
            this.database.closeConnection();
        }
        return userProfile;
    }
    @Override
    public String issueSecureToken(UserProfileDto userProfile) throws AuthenticationException {
        String returnValue = null;
        // Get salt but only part of it
        String newSaltAsPostfix = userProfile.getSalt();
        String accessTokenMaterial = userProfile.getUserId() + newSaltAsPostfix;
        byte[] encryptedAccessToken = null;
        try {
            encryptedAccessToken = authenticationUtil.encrypt(userProfile.getUserPassword(), accessTokenMaterial);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(AuthenticationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new AuthenticationException("Faled to issue secure access token");
        }
        String encryptedAccessTokenBase64Encoded = Base64.getEncoder().encodeToString(encryptedAccessToken);
        // Split token into equal parts
        int tokenLength = encryptedAccessTokenBase64Encoded.length();
        String tokenToSaveToDatabase = encryptedAccessTokenBase64Encoded.substring(0, tokenLength / 2);
        returnValue = encryptedAccessTokenBase64Encoded.substring(tokenLength / 2, tokenLength);
        userProfile.setToken(tokenToSaveToDatabase);
        storeAccessToken(userProfile);
        return returnValue;
    }
    private void storeAccessToken(UserProfileDto userProfile) {
        UserProfileEntity userEntity = new UserProfileEntity();
        BeanUtils.copyProperties(userProfile, userEntity);
        // Connect to database 
        try {
            this.database.openConnection();
            this.database.updateUserProfile(userEntity);
        } finally {
            this.database.closeConnection();
        }
    }
    private UserProfileEntity getUserProfile(String userName) {
        UserProfileEntity returnValue = null;
        try {
            this.database.openConnection();
            returnValue = this.database.getUserProfile(userName);
        } finally {
            this.database.closeConnection();
        }
        return returnValue;
    }
}