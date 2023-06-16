package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers.IOrderDishEntityMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IOrderDishRepository;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderDish;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IOrderDishPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class OrderDishMysqlAdapter implements IOrderDishPersistencePort{
    private final IOrderDishRepository orderDishRepository;
    private final IOrderDishEntityMapper orderDishEntityMapper;
    @Override
    public void saveOrderDish(List<OrderDish> orderDishes) {
        orderDishRepository.saveAll(orderDishEntityMapper.toEntity(orderDishes));
    }
}
