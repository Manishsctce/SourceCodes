package com.newjava4world.rest.tokenbasedauth;
import javax.persistence.Query;

// package com.appsdeveloperblog.ws.io.dao.impl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
/**
 *
 * @author skargopolov
 */
@Repository
public class MySQLDAO implements Database {
    Session session;
    @Override
    public void openConnection() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        this.session = sessionFactory.openSession();
    }
    @Override
    public UserProfileEntity saveUserProfile(UserProfileEntity userProfile) {
        this.session.beginTransaction();
        this.session.clear();
        this.session.save(userProfile);
        this.session.getTransaction().commit();
        return userProfile;
    }
    @Override
    public UserProfileEntity updateUserProfile(UserProfileEntity userProfile) {
        this.session.beginTransaction();
        this.session.update(userProfile);
        this.session.getTransaction().commit();
        return userProfile;
    }
    @Override
    public void closeConnection() {
        this.session.close();
    }
    @Override
    public UserProfileEntity getUserProfile(String userName) {
        UserProfileEntity returnValue = null;
        this.session.beginTransaction();
        Query query = (Query) session.createQuery("from Profile where userName='" + userName + "'");
        returnValue = (UserProfileEntity) query.getSingleResult();
        this.session.getTransaction().commit();
        return returnValue;
    }
}