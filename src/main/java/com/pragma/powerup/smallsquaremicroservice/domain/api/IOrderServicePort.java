package com.pragma.powerup.smallsquaremicroservice.domain.api;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;

import java.util.List;

public interface IOrderServicePort {
    void saveOrder(Order order, Long idClient);

    List<Order> getRestaurantOrder(int pageNumber, int pageSize, String statusOrder, Long idEmployee);
}
