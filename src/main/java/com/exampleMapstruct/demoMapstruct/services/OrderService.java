package com.exampleMapstruct.demoMapstruct.services;

import com.exampleMapstruct.demoMapstruct.model.Order;
import com.exampleMapstruct.demoMapstruct.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {

        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {

        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        return orderRepository.findById(id).map(order -> {
            order.setUser(updatedOrder.getUser());
            order.setProducts(updatedOrder.getProducts());
            return orderRepository.save(order);
        }).orElse(null);
    }

    public boolean deleteOrder(Long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
