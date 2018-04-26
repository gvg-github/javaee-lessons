package ru.lesson2.dao;

import ru.lesson2.entity.ShopOrder;
import ru.lesson2.interceptor.LogInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.NamedQuery;
import java.util.List;

@Stateless
@Interceptors({LogInterceptor.class})
public class OrderDAO extends AbstractDAO {

    public List<ShopOrder> getListOrder() {
        return em.createNamedQuery("findAllOrders", ShopOrder.class).getResultList();
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
