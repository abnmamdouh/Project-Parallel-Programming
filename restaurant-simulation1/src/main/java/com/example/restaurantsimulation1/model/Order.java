package com.example.restaurantsimulation1.model;
public class Order {
    private static int count = 0;
    private final int id;
    private final String item;

    public Order(String item) {
        this.id = ++count;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }
}
