package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers.IOrderPinEntityMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IOrderPinRepository;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderPin;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IOrderPinPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderPinMysqlAdapter implements IOrderPinPersistencePort {
    private final IOrderPinRepository orderPinRepository;
    private final IOrderPinEntityMapper orderPinEntityMapper;

    @Override
    public void saveOrderPin(OrderPin orderPin) {
        orderPinRepository.save(orderPinEntityMapper.toEntity(orderPin));
    }
}
