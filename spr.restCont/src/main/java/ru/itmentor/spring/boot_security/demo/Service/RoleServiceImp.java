package ru.itmentor.spring.boot_security.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itmentor.spring.boot_security.demo.Dao.RoleDao;
import ru.itmentor.spring.boot_security.demo.model.Role;

import javax.transaction.Transactional;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDao roleDao;


    @Override
    @Transactional
    public Role findRoleByName(String roleName) {
        return roleDao.findRoleByName(roleName);
    }
}