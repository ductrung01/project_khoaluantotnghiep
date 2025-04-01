package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.Role;
import com.dan.shoe.perfume.models.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(RoleName name);
    boolean existsByName(RoleName name);
}
