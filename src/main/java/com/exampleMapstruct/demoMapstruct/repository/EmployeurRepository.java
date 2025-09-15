package com.exampleMapstruct.demoMapstruct.repository;

import com.exampleMapstruct.demoMapstruct.model.Employeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeurRepository extends JpaRepository<Employeur, Long> {
}
