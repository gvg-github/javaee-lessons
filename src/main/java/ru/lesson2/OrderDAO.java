package ru.lesson2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderDAO {

    private List<Order> orders = new ArrayList<>();

    public Collection<Order> getListOrder() {
        return orders;
    }

    public void merge(Order order) {
        if (order == null) return;
        if (orders.contains(order)){
            orders.remove(order);
            orders.add(order);
        }else{
            orders.add(order);
        }
    }

    public void removeOrder(Order order) {
        if (order == null) return;
        orders.remove(order);
    }
}
