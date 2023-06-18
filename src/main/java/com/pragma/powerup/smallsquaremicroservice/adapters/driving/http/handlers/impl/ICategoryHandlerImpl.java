package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.CategoryReqDto;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers.ICategoryHandler;
import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req.ICategoryReqMapper;
import com.pragma.powerup.smallsquaremicroservice.domain.api.ICategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ICategoryHandlerImpl implements ICategoryHandler {
    private final ICategoryServicePort categoryServicePort;
    private final ICategoryReqMapper categoryReqMapper;

    @Override
    public void saveCategory(CategoryReqDto categoryReqDto) {
        categoryServicePort.saveCategory(categoryReqMapper.toCategory(categoryReqDto));
    }
}
