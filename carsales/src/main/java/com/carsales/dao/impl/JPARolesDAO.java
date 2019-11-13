package com.carsales.dao.impl;


import com.carsales.model.Roles;
import com.carsales.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPARolesDAO {

    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<Roles> getAll() {
        return entityManager.createQuery("select r from Roles r", Roles.class).getResultList();
    }

//    @Override
//    public Roles getOne(String email) {
//        TypedQuery<User> q = entityManager.createQuery("select u from User u where u.email = :email",User.class);
//        q.setParameter("email",email);
//        return q.getResultList().stream().findAny().orElse(null);
//
//    }

    @Transactional
    public void add(Roles role) {
        entityManager.persist(role);
    }
}
