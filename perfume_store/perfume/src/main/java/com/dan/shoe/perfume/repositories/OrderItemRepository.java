package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.Order;
import com.dan.shoe.perfume.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    Set<OrderItem> findByOrder(Order order);
    boolean existsByProductVariantId(Long id);
    void deleteByProductVariantId(Long id);
}
