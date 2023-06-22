package com.pragma.powerup.smallsquaremicroservice.domain.spi;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;

import java.util.List;

public interface IOrderPersistencePort {
    Order saveOrder(Order order);

    List<Order> getRestaurantOrder(int pageNumber, int pageSize, String statusOrder, Long idRestaurant);

    void saveOrderAll(List<Order> orders);

    Order getOrder(Long id);
}
