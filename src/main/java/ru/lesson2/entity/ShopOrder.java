package ru.lesson2.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ShopOrder")
@NamedQuery(name="findAllOrders",query="SELECT e FROM ShopOrder e")
public class ShopOrder extends AbstractEntity {

    private int number = 0;
    private Date date = new Date();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number + 1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
