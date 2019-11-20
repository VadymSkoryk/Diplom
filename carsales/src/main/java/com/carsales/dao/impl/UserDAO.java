package com.carsales.dao.impl;

import com.carsales.model.Role;
import com.carsales.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }


    public List<User> getAll(){
        return currentSession().createQuery("from User",User.class).list();
    }

    public void add(User user){
        currentSession().save(user);
    }
}
