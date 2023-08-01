package cinema.spring.service.impl;

import cinema.spring.dao.RoleDao;
import cinema.spring.model.Role;
import cinema.spring.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(Role.RoleName.valueOf(roleName)).orElseThrow(() ->
                new RuntimeException("Can't get role by name " + roleName));
    }
}
