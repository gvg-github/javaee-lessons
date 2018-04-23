package ru.lesson2.controller;

import ru.lesson2.dao.ProductDAO;
import ru.lesson2.entity.Product;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class EditProductController extends AbstractController {

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

    public void removeProduct(Product product) {
        productDAO.removeProduct(product.getId());
    }

    public List<Product> getProducts() {
        return new ArrayList<>(productDAO.getListProduct());
    }

    public String save() {
        productDAO.merge(product);
        return "editAll";
    }

    public String saveFromOrder() {
        productDAO.merge(product);
        return "editOrder";
    }

}


