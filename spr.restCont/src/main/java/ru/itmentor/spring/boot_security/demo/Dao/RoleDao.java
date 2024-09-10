package ru.itmentor.spring.boot_security.demo.Dao;


import ru.itmentor.spring.boot_security.demo.model.Role;

public interface RoleDao {

    Role findRoleByName(String roleName);
}
