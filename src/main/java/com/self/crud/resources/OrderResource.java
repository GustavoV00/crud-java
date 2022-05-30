package com.self.crud.resources;

import java.util.List;

import com.self.crud.entities.Order;
import com.self.crud.services.OrderService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

  private OrderService orderService;

  public OrderResource(OrderService orderService) {
    super();
    this.orderService = orderService;
  }

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    List<Order> orders = orderService.findAll();
    return ResponseEntity.ok().body(orders);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable int id) {
    Order obj = orderService.findById(id);
    return ResponseEntity.ok().body(obj);

  }
}
