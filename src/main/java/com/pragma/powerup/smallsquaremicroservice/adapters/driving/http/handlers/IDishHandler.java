package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;


import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishUpdateReqDto;

public interface IDishHandler {
    void saveDish(DishReqDto dishReqDto);
    void updateDish(DishUpdateReqDto dishUpdateReqDto);
}