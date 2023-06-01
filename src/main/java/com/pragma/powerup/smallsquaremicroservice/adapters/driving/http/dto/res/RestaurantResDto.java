package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantResDto {
    private String name;
    private String urlLogo;
}
