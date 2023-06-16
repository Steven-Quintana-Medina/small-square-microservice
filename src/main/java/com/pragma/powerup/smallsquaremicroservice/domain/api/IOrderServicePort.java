package com.pragma.powerup.smallsquaremicroservice.domain.api;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;

public interface IOrderServicePort {
    void saveOrder(Order order,Long idClient);
}
