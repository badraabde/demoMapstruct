package com.exampleMapstruct.demoMapstruct.repository;


import com.exampleMapstruct.demoMapstruct.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
