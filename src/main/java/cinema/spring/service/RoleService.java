package cinema.spring.service;

import cinema.spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
