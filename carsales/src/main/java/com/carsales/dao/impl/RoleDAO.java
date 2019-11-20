package com.carsales.dao.impl;


import com.carsales.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }

    public List<Role> getAll(){
    return currentSession().createQuery("from Role",Role.class).list();
    }

    public void add(Role role){
        currentSession().save(role);
    }



}
