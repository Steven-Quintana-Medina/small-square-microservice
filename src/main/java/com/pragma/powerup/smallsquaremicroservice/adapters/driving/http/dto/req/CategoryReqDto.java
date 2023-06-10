package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CategoryReqDto {
    @Schema(title = "name", description = "Name of a category", example = "drink")
    @NotBlank
    private String name;
    @Schema(title = "description", description = "Description of a category", example = "Cold drinks")
    @NotBlank
    private String description;
}
