package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.Address;
import com.dan.shoe.perfume.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUser(User user);
    Address findByUserAndPrimaryAddressTrue(User user);
}