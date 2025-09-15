package com.exampleMapstruct.demoMapstruct.repository;

import com.exampleMapstruct.demoMapstruct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
