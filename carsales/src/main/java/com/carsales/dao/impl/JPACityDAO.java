package com.carsales.dao.impl;

import com.carsales.model.City;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPACityDAO {

    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<City> getAll() {
        return entityManager.createQuery("select f from City f", City.class).getResultList();
    }

    @Transactional
    public void add(City city) {
        entityManager.persist(city);
    }
}
