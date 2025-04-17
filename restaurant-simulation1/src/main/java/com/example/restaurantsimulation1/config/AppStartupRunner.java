package com.example.restaurantsimulation1.config;


import com.example.restaurantsimulation1.service.ChefWorker;
import com.example.restaurantsimulation1.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements CommandLineRunner {

    private final OrderService orderService;

    public AppStartupRunner(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) {
        // Start 3 chef threads
        for (int i = 1; i <= 3; i++) {
            Thread chef = new Thread(new ChefWorker(orderService, i));
            chef.start();
        }
    }
}
