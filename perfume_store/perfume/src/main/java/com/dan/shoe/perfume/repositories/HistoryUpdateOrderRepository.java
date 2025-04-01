package com.dan.shoe.perfume.repositories;

import java.util.List;

import com.dan.shoe.perfume.models.HistoryUpdateOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryUpdateOrderRepository extends JpaRepository<HistoryUpdateOrder, Long> {
    List<HistoryUpdateOrder> findByOrder_Id(Long orderId);
}
