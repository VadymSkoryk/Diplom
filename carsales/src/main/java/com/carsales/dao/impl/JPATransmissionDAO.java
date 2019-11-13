package com.carsales.dao.impl;


import com.carsales.model.TransmissionType;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPATransmissionDAO {
    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<TransmissionType> getAll() {
        return entityManager.createQuery("select t from TransmissionType t", TransmissionType.class).getResultList();
    }

    @Transactional
    public void add(TransmissionType tt) {
        entityManager.persist(tt);
    }
}
