package com.dan.shoe.perfume.services;

import com.dan.shoe.perfume.models.enums.RoleName;
import com.dan.shoe.perfume.models.Role;

public interface RoleService {
    Role findByName(RoleName name);
}
