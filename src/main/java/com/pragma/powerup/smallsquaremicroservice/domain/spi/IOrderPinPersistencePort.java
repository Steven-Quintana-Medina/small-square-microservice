package com.pragma.powerup.smallsquaremicroservice.domain.spi;

import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderPin;

public interface IOrderPinPersistencePort {
    void saveOrderPin(OrderPin orderPin);
}
