package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderDishResDto {
    private DishResDto idDish;
    private int quantity;
}
