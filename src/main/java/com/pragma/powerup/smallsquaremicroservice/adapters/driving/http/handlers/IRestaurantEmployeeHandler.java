package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantEmployeeReqDto;

public interface IRestaurantEmployeeHandler {
    void assignRestaurantEmployee(RestaurantEmployeeReqDto restaurantEmployeeReqDto);
}
