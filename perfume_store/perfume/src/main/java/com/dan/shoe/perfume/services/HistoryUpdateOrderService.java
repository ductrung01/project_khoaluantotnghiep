package com.dan.shoe.perfume.services;

import java.util.List;

import com.dan.shoe.perfume.models.HistoryUpdateOrder;

public interface HistoryUpdateOrderService {
    HistoryUpdateOrder createHistoryUpdateOrder(HistoryUpdateOrder historyUpdateOrder);
    List<HistoryUpdateOrder> getByOrderId(Long orderId);
}
