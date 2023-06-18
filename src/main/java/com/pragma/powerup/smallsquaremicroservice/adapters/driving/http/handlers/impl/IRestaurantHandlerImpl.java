package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.RestaurantResDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IRestaurantHandler;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req.IRestaurantReqMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.res.IRestaurantResMapper;
import com.pragma.powerup.smallsquaremicroservice.domain.api.IRestaurantServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IRestaurantHandlerImpl implements IRestaurantHandler {
    private final IRestaurantServicePort restaurantServicePort;
    private final IRestaurantReqMapper restaurantReqMapper;
    private final IRestaurantResMapper restaurantResMapper;

    @Override
    public void saveRestaurant(RestaurantReqDto restaurantReqDto) {
        restaurantServicePort.saveRestaurant(restaurantReqMapper.toRestaurant(restaurantReqDto));
    }

    @Override
    public List<RestaurantResDto> getAllRestaurant(int pageNumber, int pageSize) {
        return restaurantResMapper.toRestaurantList(restaurantServicePort.getAllRestaurant(pageNumber, pageSize));
    }
}
