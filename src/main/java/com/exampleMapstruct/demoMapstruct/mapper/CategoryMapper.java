package com.exampleMapstruct.demoMapstruct.mapper;

import com.exampleMapstruct.demoMapstruct.dto.CategoryDTO;
import com.exampleMapstruct.demoMapstruct.model.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDto(Category category);
    Category toEntity(CategoryDTO dto);
}