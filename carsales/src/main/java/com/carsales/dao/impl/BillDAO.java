package com.carsales.dao.impl;


import com.carsales.model.Bill;
import com.carsales.model.City;
import com.carsales.model.Country;
import com.carsales.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BillDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }

    public List<Bill> getAll(){
        return currentSession().createQuery("from Bill",Bill.class).list();
    }

    public void add(Bill bill){
        currentSession().save(bill);
    }

    private List<City> getCityList(int id){

        Query q =  currentSession().createQuery(" from City where idcountry = :param");
        q.setParameter("param",id);
        return q.list();
    }

    private List<Country> getCountryList(){
        return currentSession().createQuery("from Country").list();
    }
}
