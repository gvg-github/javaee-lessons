package ru.lesson2;

import java.util.UUID;

public class Product {

    private int cost;
    private String name;
    private String id;

    public Product() {
        this.cost = 0;
        this.name = "";
        this.id = UUID.randomUUID().toString();
    }

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
