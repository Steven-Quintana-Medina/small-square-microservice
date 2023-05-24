package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DishUpdateReqDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    @Schema(title = "price", description = "Price of a dish", example = "50000.00")
    @NotBlank
    private double price;
    @Schema(title = "description", description = "Description of a dish", example = "-two portions of meat\n-cheese\n-bacon")
    @NotBlank
    private String description;

    public void setId(Long id) {
        this.id = id;
    }
}
