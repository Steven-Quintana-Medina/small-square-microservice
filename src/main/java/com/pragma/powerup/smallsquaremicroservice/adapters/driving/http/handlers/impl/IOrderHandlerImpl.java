package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.OrderReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IOrderHandler;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req.IOrderReqMapper;
import com.pragma.powerup.smallsquaremicroservice.config.security.jwt.JwtService;
import com.pragma.powerup.smallsquaremicroservice.domain.api.IOrderServicePort;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IOrderHandlerImpl implements IOrderHandler {
    private final IOrderServicePort orderServicePort;
    private final IOrderReqMapper orderReqMapper;
    private final JwtService jwtService;
    private final HttpServletRequest request;
    @Override
    public void saveOrder(OrderReqDto orderReqDto) {
        orderServicePort.saveOrder(orderReqMapper.toOrder(orderReqDto),jwtService.getIdToken(request.getHeader("Authorization")));
    }
}
