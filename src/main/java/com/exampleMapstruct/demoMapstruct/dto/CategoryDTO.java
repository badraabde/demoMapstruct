package com.exampleMapstruct.demoMapstruct.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    // ⚠ Pas de liste de produits ici (sinon cycle)
}
