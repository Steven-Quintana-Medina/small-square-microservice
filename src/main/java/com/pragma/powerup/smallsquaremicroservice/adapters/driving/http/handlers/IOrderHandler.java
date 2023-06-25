package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.AssignEmployeeOrderDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.OrderReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.OrderResDto;

import java.util.List;

public interface IOrderHandler {
    void saveOrder(OrderReqDto orderReqDto);

    void updateStatusToReady(Long id);

    void updateStatusToDelivered(String pin);

    List<OrderResDto> getRestaurantOrders(int pageNumber, int pageSize, String statusOrder);

    List<OrderResDto> assignEmployeeOrder(int pageNumber, int pageSize, String statusOrder, AssignEmployeeOrderDto assignEmployeeOrderDto);
}
