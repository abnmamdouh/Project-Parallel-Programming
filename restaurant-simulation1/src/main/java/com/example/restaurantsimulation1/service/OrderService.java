package com.example.restaurantsimulation1.service;
import com.example.restaurantsimulation1.model.Order;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class OrderService {

    private final BlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    public void placeOrder(Order order) throws InterruptedException {
        orderQueue.put(order);
        System.out.println("Order placed: " + order.getItem() + " (ID: " + order.getId() + ")");
    }

    public BlockingQueue<Order> getOrderQueue() {
        return orderQueue;
    }
}
