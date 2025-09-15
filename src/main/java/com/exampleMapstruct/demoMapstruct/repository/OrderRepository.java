package com.exampleMapstruct.demoMapstruct.repository;

import com.exampleMapstruct.demoMapstruct.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
