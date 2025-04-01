package com.dan.shoe.perfume.services.impls;

import com.dan.shoe.perfume.models.Role;
import com.dan.shoe.perfume.models.enums.RoleName;
import com.dan.shoe.perfume.repositories.RoleRepository;
import com.dan.shoe.perfume.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
