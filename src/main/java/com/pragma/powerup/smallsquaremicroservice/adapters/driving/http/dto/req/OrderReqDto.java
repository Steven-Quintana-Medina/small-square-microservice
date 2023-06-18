package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class OrderReqDto {
    @Schema(title = "idRestaurant", description = "id of a restaurant", example = "1")
    private Long idRestaurant;
    @Schema(title = "orderDish", description = "id of a dish")
    private List<OrderDishReqDto> orderDishes;
}
