package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.OrderReqDto;

public interface IOrderHandler {
    void saveOrder(OrderReqDto orderReqDto);
}
