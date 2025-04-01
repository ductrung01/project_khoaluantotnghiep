package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.Cart;
import com.dan.shoe.perfume.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);
}
