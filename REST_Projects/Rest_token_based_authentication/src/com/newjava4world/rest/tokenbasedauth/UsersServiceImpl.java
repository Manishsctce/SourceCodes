package com.newjava4world.rest.tokenbasedauth;

import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    Database database;
    AuthenticationUtil authenticationUtil;
    
    @Autowired
    public UsersServiceImpl(Database database, AuthenticationUtil authenticationUtil)
    {
        this.database = database;
        this.authenticationUtil = authenticationUtil;
    }
    @Override
    public UserProfileDto saveUser(UserProfileDto userDto) throws UserServiceException {
        
        UserProfileDto returnValue = null;
        
        // Generate salt
        String salt = authenticationUtil.generateSalt(30);
        
        // Generate secure user password 
        String secureUserPassword = null;
        
        try {
            secureUserPassword = authenticationUtil.
                    generateSecurePassword(userDto.getUserPassword(), salt);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(UsersServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new UserServiceException(ex.getLocalizedMessage());
        } 
        
        //Generate secure public user id
        String securePublicUserId = authenticationUtil.generateUserId(30);
        
        userDto.setSalt(salt);
        userDto.setUserPassword(secureUserPassword); 
        userDto.setUserId(securePublicUserId);
                
        UserProfileEntity userEntity = new UserProfileEntity();
        BeanUtils.copyProperties(userDto, userEntity);
     
        // Connect to database 
        try {
            this.database.openConnection();
            UserProfileEntity storedUserEntity = this.database.saveUserProfile(userEntity);
            if(storedUserEntity != null && storedUserEntity.getId()>0)
            {
                returnValue = new UserProfileDto();
                BeanUtils.copyProperties(storedUserEntity, returnValue);
            }
        }  finally {
            this.database.closeConnection();
        }
        
        return returnValue;
    }
	@Override
	public UserProfileDto getUserProfileByPublicId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}