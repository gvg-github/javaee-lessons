package ru.lesson2;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class ProductDAO {

    private Map<String, Product> products = new LinkedHashMap<>();

    public Collection<Product> getListProduct() {
        return products.values();
    }

    public void persist(Product product) {
        if (product == null) return;
        products.put(product.getId(), product);
    }

    public Product getProductById(String id) {
        if (id == null) return null;
        return products.get(id);
    }

    public void merge(Product product) {
        if (product == null) return;
        products.put(product.getId(), product);
    }

    public void removeProduct(Product product) {
        if (product == null) return;
        products.remove(product.getId());
    }

}
