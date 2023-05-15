package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantReqDto {
    @Schema(title = "nit", description = "nit of a restaurant (ONLY NUMBERS)", example = "10004413")
    @NotBlank
    private String nit;

    @Schema(title = "name", description = "name of a restaurant", example = "twenty one pilots - Ride")
    @NotBlank
    private String name;

    @Schema(title = "adress", description = "address of a restaurant", example = "la victoria Mz 14 L8")
    @NotBlank
    private String address;

    @Schema(title = "phone", description = "phone of a restaurant", example = "+573004055089")
    @NotBlank
    private String phone;

    @Schema(title = "urlLogo", description = "restaurant logo url", example = "https://image-0.uhdpaper.com/wallpaper/eat-sleep-code-repeat-background-digital-art-4k-wallpaper-uhdpaper.com-249@0@g.jpg")
    @NotBlank
    private String urlLogo;

    @Schema(title = "idOwner", description = "restaurant owner id", example = "2")
    @NotBlank
    private String idOwner;
}
