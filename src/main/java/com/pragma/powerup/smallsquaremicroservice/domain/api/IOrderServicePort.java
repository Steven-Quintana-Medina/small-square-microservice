package com.pragma.powerup.smallsquaremicroservice.domain.api;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;

import java.util.List;

public interface IOrderServicePort {
    void saveOrder(Order order, Long idClient);

    void updateStatusToReady(Long id);

    void updateStatusToDelivered(String pin);

    List<Order> getRestaurantOrder(int pageNumber, int pageSize, String statusOrder, Long idEmployee);

    List<Order> assignEmployeeOrder(int pageNumber, int pageSize, String statusOrder, List<Long> idOrders, Long idEmployee);
}
