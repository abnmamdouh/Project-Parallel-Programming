package com.example.restaurantsimulation1.controller;


import com.example.restaurantsimulation1.model.Order;
import com.example.restaurantsimulation1.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String placeOrder(@RequestParam String item) throws InterruptedException {
        Order order = new Order(item);
        orderService.placeOrder(order);
        return "Order placed: " + order.getItem() + " (ID: " + order.getId() + ")";
    }
}
