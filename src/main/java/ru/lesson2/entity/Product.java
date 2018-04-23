package ru.lesson2.entity;

import javax.persistence.*;

@Entity
public class Product extends AbstractEntity {

    private int cost = 0;
    private int count = 0;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String name = "";

    @Column
    private String description = "";

    @ManyToOne
    private Category category;

    @ManyToOne
    private ShopOrder order;

    public ShopOrder getOrder() {
        return order;
    }

    public void setOrder(ShopOrder order) {
        this.order = order;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
