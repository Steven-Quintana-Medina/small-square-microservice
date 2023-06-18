package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.OrderReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.OrderResDto;

import java.util.List;

public interface IOrderHandler {
    void saveOrder(OrderReqDto orderReqDto);

    List<OrderResDto> getRestaurantOrders(int pageNumber, int pageSize, String statusOrder);
}
