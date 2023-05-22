package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;


import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;

public interface IDishHandler {
    void saveDish(DishReqDto dishReqDto);
}