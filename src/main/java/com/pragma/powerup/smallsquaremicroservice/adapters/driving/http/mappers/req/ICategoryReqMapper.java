package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.CategoryReqDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface ICategoryReqMapper {
    Category toCategory(CategoryReqDto categoryReqDto);
}
