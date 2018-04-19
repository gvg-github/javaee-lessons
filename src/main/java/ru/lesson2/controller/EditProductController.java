package ru.lesson2.controller;

import ru.lesson2.Product;
import ru.lesson2.ProductDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean(name="editProduct")
public class EditProductController extends AbstractController{

    private final String id = getParamString("id");

    @Inject
    private ProductDAO productDAO;

    private Product product;

    @PostConstruct
    private void init() {
        product = productDAO.getProductById(id);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void addProduct() {
        productDAO.persist(new Product());
    }

    public String save() {
        productDAO.merge(product);
        return "editAll";
    }
}
