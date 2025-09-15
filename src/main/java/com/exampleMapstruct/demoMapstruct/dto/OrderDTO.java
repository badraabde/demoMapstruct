package com.exampleMapstruct.demoMapstruct.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private String status;
    private LocalDateTime orderDate;
    private List<ProductDTO> products; // ⚠ Pas de "User" ici
}
