package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantEmployeeReqDto {
    @Schema(title = "idEmployee",description = "Id of an employee",example = "1")
    @NotBlank
    private Long idEmployee;
    @Schema(title = "idRestaurant",description = "Id of a restaurant",example = "1")
    @NotBlank
    private Long idRestaurant;
}
