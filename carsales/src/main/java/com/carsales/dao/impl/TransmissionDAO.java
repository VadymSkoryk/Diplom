package com.carsales.dao.impl;


import com.carsales.model.Transmission;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransmissionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }


    public List<Transmission> getAll(){
        return currentSession().createQuery("from Transmission ", Transmission.class).list();
    }

    public void add(Transmission tm){
        currentSession().save(tm);
    }

}
