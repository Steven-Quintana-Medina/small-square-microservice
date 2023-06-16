package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantEmployeeReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IRestaurantEmployeeHandler;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req.IRestaurantEmployeeReqMapper;
import com.pragma.powerup.smallsquaremicroservice.config.security.jwt.JwtService;
import com.pragma.powerup.smallsquaremicroservice.domain.api.IRestaurantEmployeeServicePort;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantEmployeeHandlerImpl implements IRestaurantEmployeeHandler {
    private final IRestaurantEmployeeServicePort restaurantEmployeeServicePort;
    private final IRestaurantEmployeeReqMapper restaurantEmployeeReqMapper;
    private final JwtService jwtService;
    private final HttpServletRequest request;

    @Override
    public void assignRestaurantEmployee(RestaurantEmployeeReqDto restaurantEmployeeReqDto) {
        restaurantEmployeeServicePort.assignRestaurantEmployee(restaurantEmployeeReqMapper.toRestaurantEmployee(restaurantEmployeeReqDto),jwtService.getIdToken(request.getHeader("Authorization")));
    }
}
