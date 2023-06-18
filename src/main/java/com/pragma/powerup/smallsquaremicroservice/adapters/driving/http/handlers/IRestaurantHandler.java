package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.RestaurantResDto;

import java.util.List;

public interface IRestaurantHandler {
    void saveRestaurant(RestaurantReqDto restaurantReqDto);

    List<RestaurantResDto> getAllRestaurant(int pageNumber, int pageSize);
}
