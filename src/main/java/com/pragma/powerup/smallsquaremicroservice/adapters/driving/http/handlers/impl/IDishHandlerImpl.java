package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishUpdateReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishUpdateStatusReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.DishResDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.IDishHandler;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req.IDishReqMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.res.IDishResMapper;
import com.pragma.powerup.smallsquaremicroservice.config.security.jwt.JwtService;
import com.pragma.powerup.smallsquaremicroservice.domain.api.IDishServicePort;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IDishHandlerImpl implements IDishHandler {
    private final IDishServicePort dishServicePort;
    private final IDishReqMapper dishReqMapper;
    private final IDishResMapper dishResMapper;
    private final JwtService jwtService;
    private final HttpServletRequest request;

    @Override
    public void saveDish(DishReqDto dishReqDto) {
        dishServicePort.saveDish(dishReqMapper.toDish(dishReqDto), jwtService.getIdToken(request.getHeader("Authorization")));

    }

    @Override
    public void updateDish(DishUpdateReqDto dishUpdateReqDto) {
        dishServicePort.updateDish(dishReqMapper.toDish(dishUpdateReqDto), jwtService.getIdToken(request.getHeader("Authorization")));
    }

    @Override
    public void updateDishStatus(DishUpdateStatusReqDto dishUpdateStatusReqDto) {
        dishServicePort.updateDishStatus(dishReqMapper.toDish(dishUpdateStatusReqDto), jwtService.getIdToken(request.getHeader("Authorization")));
    }

    @Override
    public List<DishResDto> getDishes(int pageNumber, int pageSize, Long idRestaurant, Long idCategory) {
        return dishResMapper.toDishList(dishServicePort.getDishes(pageNumber, pageSize, idRestaurant, idCategory));
    }
}
