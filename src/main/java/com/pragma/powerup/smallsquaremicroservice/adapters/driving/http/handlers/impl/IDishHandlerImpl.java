package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IDishHandler;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req.IDishReqMapper;
import com.pragma.powerup.smallsquaremicroservice.domain.api.IDishServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IDishHandlerImpl implements IDishHandler {
    private final IDishServicePort dishServicePort;
    private final IDishReqMapper dishReqMapper;
    @Override
    public void saveDish(DishReqDto dishReqDto) {
        dishServicePort.saveDish(dishReqMapper.toDish(dishReqDto));

    }
}
