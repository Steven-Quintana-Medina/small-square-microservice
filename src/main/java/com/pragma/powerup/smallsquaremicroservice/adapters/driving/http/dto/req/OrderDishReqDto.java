package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderDishReqDto {
    @Schema(title = "idDish", description = "id of a dish", example = "1")
    private Long idDish;
    @Schema(title = "quantity", description = "amount of the dish", example = "5")
    private int quantity;
}
