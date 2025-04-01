package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.Cart;
import com.dan.shoe.perfume.models.CartItem;
import com.dan.shoe.perfume.models.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Set<CartItem> findByCart(Cart cart);
    CartItem findByCartAndProductVariant(Cart cart, ProductVariant productVariant);
    void deleteByCart(Cart cart);
    boolean existsByProductVariantId(Long id);
    void deleteByProductVariantId(Long id);
}
