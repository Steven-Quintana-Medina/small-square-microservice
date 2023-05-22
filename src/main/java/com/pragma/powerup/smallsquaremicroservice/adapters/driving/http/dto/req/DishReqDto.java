package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DishReqDto {
    @Schema(title = "name", description = "Name of a dish", example = "hamburger")
    @NotBlank
    private String name;
    @Schema(title = "price", description = "Price of a dish", example = "50000.00")
    @NotBlank
    private double price;
    @Schema(title = "description", description = "Description of a dish", example = "-two portions of meat\n-cheese\n-bacon")
    @NotBlank
    private String description;
    @Schema(title = "urlImage", description = "Url of the image of a dish", example = "https://image-0.uhdpaper.com/wallpaper/eat-sleep-code-repeat-background-digital-art-4k-wallpaper-uhdpaper.com-249@0@g.jpg")
    @NotBlank
    private String urlImage;
    @Schema(title = "category", description = "Category of a dish", example = "1")
    @NotBlank
    private Long idCategory;
    @Schema(title = "restaurant", description = "Restaurant of a dish", example = "1")
    @NotBlank
    private Long idRestaurant;
}
