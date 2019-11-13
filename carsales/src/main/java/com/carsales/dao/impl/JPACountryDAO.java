package com.carsales.dao.impl;

import com.carsales.model.Country;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPACountryDAO {
    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<Country> getAll() {
        return entityManager.createQuery("select f from Country f", Country.class).getResultList();
    }

    @Transactional
    public void add(Country country) {
        entityManager.persist(country);
    }
}
