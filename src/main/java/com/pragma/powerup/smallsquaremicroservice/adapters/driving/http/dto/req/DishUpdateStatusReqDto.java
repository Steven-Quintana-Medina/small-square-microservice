package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DishUpdateStatusReqDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(enumAsRef = true, allowableValues = {"true", "false"})
    private boolean status;

    public void setId(Long id) {
        this.id = id;
    }
}
