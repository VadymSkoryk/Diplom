package com.carsales.dao.impl;


import com.carsales.model.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }

    public List<City> getAll(){
        return currentSession().createQuery("from City ",City.class).list();
    }

    public List<City> getByIdCountry(int idcountry){
        Query q = currentSession().createQuery("from City where idcountry = :param");
        q.setParameter("param",idcountry);
        return q.list();
    }

    public void add(City city){
        currentSession().save(city);
    }

}
