package com.carsales.dao.impl;


import com.carsales.model.Fuel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuelDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }


    public List<Fuel> getAll(){
        return currentSession().createQuery("from Fuel",Fuel.class).list();
    }

    public void add(Fuel fuel){
        currentSession().save(fuel);
    }
}
