package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantReqDto;

public interface IRestaurantHandler {
    void saveRestaurant(RestaurantReqDto restaurantReqDto);
}
