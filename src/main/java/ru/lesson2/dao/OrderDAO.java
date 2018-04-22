package ru.lesson2.dao;

import ru.lesson2.entity.ShopOrder;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class OrderDAO extends AbstractDAO {

    public List<ShopOrder> getListOrder() {
        return em.createQuery("SELECT e FROM ShopOrder e", ShopOrder.class).getResultList();
    }

    public void persist(ShopOrder shopOrder) {
        if (shopOrder == null) return;
        em.persist(shopOrder);
    }

    public ShopOrder getOrderById(String id) {
        if (id == null) return null;
        return em.find(ShopOrder.class, id);
    }

    public void merge(ShopOrder shopOrder) {
        if (shopOrder == null) return;
        em.merge(shopOrder);
    }

    public void removeOrder(String orderId) {
        if (orderId == null || orderId.isEmpty()) return;
        ShopOrder shopOrder = em.find(ShopOrder.class, orderId);
        em.remove(shopOrder);
    }
}
