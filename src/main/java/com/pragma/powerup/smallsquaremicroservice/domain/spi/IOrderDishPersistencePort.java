package com.pragma.powerup.smallsquaremicroservice.domain.spi;

import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderDish;

import java.util.List;

public interface IOrderDishPersistencePort {
    void saveOrderDish(List<OrderDish> orderDishes);
}
