package com.exampleMapstruct.demoMapstruct.mapper;

import com.exampleMapstruct.demoMapstruct.dto.ProductDTO;
import com.exampleMapstruct.demoMapstruct.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDto(Product product);
    Product toEntity(ProductDTO dto);
}
