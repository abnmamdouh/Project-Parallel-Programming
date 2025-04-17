package com.example.restaurantsimulation1.service;



import com.example.restaurantsimulation1.model.Order;

public class ChefWorker implements Runnable {

    private final OrderService orderService;
    private final int chefId;

    public ChefWorker(OrderService orderService, int chefId) {
        this.orderService = orderService;
        this.chefId = chefId;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = orderService.getOrderQueue().take();
                System.out.println("Chef " + chefId + " is preparing order: " + order.getItem() + " (ID: " + order.getId() + ")");
                Thread.sleep(3000); // Simulate cooking time
                System.out.println("Chef " + chefId + " finished order: " + order.getItem() + " (ID: " + order.getId() + ")");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
