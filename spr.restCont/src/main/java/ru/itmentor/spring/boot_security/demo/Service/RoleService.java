package ru.itmentor.spring.boot_security.demo.Service;

import ru.itmentor.spring.boot_security.demo.model.Role;

public interface RoleService {

    Role findRoleByName(String roleName);
}