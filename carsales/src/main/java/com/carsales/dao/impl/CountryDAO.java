package com.carsales.dao.impl;


import com.carsales.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }

    public List<Country> getAll(){
        return currentSession().createQuery("from Country ", Country.class).list();
    }

    public void add(Country country){
        currentSession().save(country);
    }

}
