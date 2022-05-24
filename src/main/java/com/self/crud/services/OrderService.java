package com.self.crud.services;

import java.util.List;
import java.util.Optional;

import com.self.crud.entities.Order;
import com.self.crud.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        super();
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(int id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }

}
