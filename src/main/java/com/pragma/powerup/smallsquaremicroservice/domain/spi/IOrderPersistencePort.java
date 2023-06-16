package com.pragma.powerup.smallsquaremicroservice.domain.spi;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;
import com.pragma.powerup.smallsquaremicroservice.domain.model.RestaurantEmployee;

public interface IOrderPersistencePort {
    Order saveOrder(Order order);
}
