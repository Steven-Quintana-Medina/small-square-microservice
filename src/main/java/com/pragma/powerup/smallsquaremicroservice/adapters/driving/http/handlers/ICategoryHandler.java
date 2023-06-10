package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.CategoryReqDto;

public interface ICategoryHandler {
    void saveCategory(CategoryReqDto categoryReqDto);
}
