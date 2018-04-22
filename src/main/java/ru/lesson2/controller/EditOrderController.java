package ru.lesson2.controller;

import ru.lesson2.dao.OrderDAO;
import ru.lesson2.entity.ShopOrder;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class EditOrderController extends AbstractController{

    private final String id = getParamString("id");

    @Inject
    private OrderDAO orderDAO;

    private ShopOrder order;

    @PostConstruct
    private void init() {
        order = orderDAO.getOrderById(id);
    }

    public ShopOrder getShopOrder() {
        return order;
    }

    public void setShopOrder(ShopOrder order) {
        this.order = order;
    }

    public void addOrder() {
        orderDAO.persist(new ShopOrder());
    }

    public void removeOrder(ShopOrder order) {
        orderDAO.removeOrder(order.getId());
    }

    public List<ShopOrder> getOrders() {
        return new ArrayList<>(orderDAO.getListOrder());
    }

    public String save() {
        //orderDAO.merge(order);
        return "editAll";
    }

}
