package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;


import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishUpdateReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishUpdateStatusReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.DishResDto;

import java.util.List;

public interface IDishHandler {
    void saveDish(DishReqDto dishReqDto);

    void updateDish(DishUpdateReqDto dishUpdateReqDto);

    void updateDishStatus(DishUpdateStatusReqDto dishUpdateStatusReqDto);

    List<DishResDto> getDishes(int pageNumber, int pageSize, Long idRestaurant, Long idCategory);
}