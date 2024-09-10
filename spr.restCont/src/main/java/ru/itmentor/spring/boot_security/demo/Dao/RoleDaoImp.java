package ru.itmentor.spring.boot_security.demo.Dao;


import org.springframework.stereotype.Repository;
import ru.itmentor.spring.boot_security.demo.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role findRoleByName(String roleName) {
        return entityManager
                .createQuery("select r from Role r where r.name = :roleName", Role.class)
                .setParameter("roleName", roleName)
                .getSingleResult();
    }
}