package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.controller;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.OrderReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.OrderResDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IOrderHandler;
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
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.pragma.powerup.smallsquaremicroservice.config.Constants.*;

@RestController
@RequestMapping("/order/")
@RequiredArgsConstructor
@Tag(name = "Order", description = "Endpoints related to order")
@SecurityRequirement(name = "jwt")
public class OrderController {
    private final IOrderHandler orderHandler;

    @Operation(summary = "Add a new order",
            responses = {
                    @ApiResponse(responseCode = "201", description = ORDER_CREATED_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),
                    @ApiResponse(responseCode = "409", description = SWAGGER_ORDER_ERROR,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "401", description = WRONG_CREDENTIALS_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),

            })
    @PostMapping
    public ResponseEntity<Map<String, String>> saveOrder(@RequestBody OrderReqDto orderReqDto) {
        orderHandler.saveOrder(orderReqDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, ORDER_CREATED_MESSAGE));
    }

    @Operation(summary = "Get orders from a restaurant",
            responses = {
                    @ApiResponse(responseCode = "200", description = "[{}]",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),
                    @ApiResponse(responseCode = "401", description = WRONG_CREDENTIALS_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),

            })
    @GetMapping
    public ResponseEntity<List<OrderResDto>> getOrders(@RequestParam int pageNumber, @RequestParam int pageSize, @RequestParam String statusOrder) {
        return ResponseEntity.ok(orderHandler.getRestaurantOrders(pageNumber, pageSize, statusOrder));
    }

}
