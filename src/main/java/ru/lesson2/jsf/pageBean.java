package ru.lesson2.jsf;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="pageBean")
@SessionScoped
public class pageBean {

    final private String mainPage = "Main page";
    final private String catalogPage = "Catalog page";
    final private String cartPage = "Cart page";
    final private String orderPage = "Order page";
    final private String productPage = "Product page";

    public String getCatalogPage() {
        return catalogPage;
    }

    public String getMainPage() {
        return mainPage;
    }

    public String getProductPage() {
        return productPage;
    }

    public String getOrderPage() {
        return orderPage;
    }

    public String getCartPage() {
        return cartPage;
    }
}
