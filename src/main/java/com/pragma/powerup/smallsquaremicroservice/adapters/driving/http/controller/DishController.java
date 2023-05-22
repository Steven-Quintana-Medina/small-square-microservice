package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.controller;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IDishHandler;
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
@RequestMapping("/dish")
@RequiredArgsConstructor
@Tag(name = "Dish", description = "Endpoints related to dish")
@SecurityRequirement(name = "jwt")
public class DishController {
    private final IDishHandler dishHandler;
    @Operation(summary = "Add a new dish",
            responses = {
                    @ApiResponse(responseCode = "201", description = DISH_CREATED_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),
                    @ApiResponse(responseCode = "409", description = SWAGGER_DISH_ERROR,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "401", description = WRONG_CREDENTIALS_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
            })
    @PostMapping
    public ResponseEntity<Map<String, String>> saveDish(@RequestBody DishReqDto dishReqDto) {
        dishHandler.saveDish(dishReqDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, DISH_CREATED_MESSAGE));
    }
}
