package com.exampleMapstruct.demoMapstruct.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private double price;
    private CategoryDTO category; // ⚠ Mais pas de "List<ProductDTO>" dans CategoryDTO
}
