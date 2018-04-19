package ru.lesson2;

import java.util.ArrayList;
import java.util.UUID;

public class Order {

    private String name;
    private String id;
    private ArrayList<Product> products;

    public Order(String name, String id) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        if (products.contains(product)){
            products.remove(product);
        }
    }
}
