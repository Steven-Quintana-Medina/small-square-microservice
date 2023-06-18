package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.controller;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantEmployeeReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IRestaurantEmployeeHandler;
import com.pragma.powerup.smallsquaremicroservice.config.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import static com.pragma.powerup.smallsquaremicroservice.config.Constants.*;

@RestController
@RequestMapping("/restaurantEmployee/")
@RequiredArgsConstructor
@Tag(name = "RestaurantEmployee", description = "Endpoints related to restaurants with respect to employees")
@SecurityRequirement(name = "jwt")
public class RestaurantEmployeeController {
    private final IRestaurantEmployeeHandler restaurantEmployeeHandler;

    @Operation(summary = "assign restaurant an employee",
            responses = {
                    @ApiResponse(responseCode = "201", description = ASSIGN_RESTAURANT_EMPLOYEE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),
                    @ApiResponse(responseCode = "409", description = SWAGGER_ASSIGN_RESTAURANT_EMPLOYEE_ERROR,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "401", description = WRONG_CREDENTIALS_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
            })
    @PostMapping
    public ResponseEntity<Map<String, String>> assignRestaurantEmployee(@RequestBody RestaurantEmployeeReqDto restaurantEmployeeReqDto) {
        restaurantEmployeeHandler.assignRestaurantEmployee(restaurantEmployeeReqDto);
        return ResponseEntity.status(HttpStatus.OK)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, ASSIGN_RESTAURANT_EMPLOYEE));
    }
}
