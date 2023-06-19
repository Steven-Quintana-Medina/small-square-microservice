package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AssignEmployeeOrderDto {
    @Schema(title = "idOrders", description = "id of the orders to assign", example = "[1,2,3]")
    private List<Long> idOrders;
}
