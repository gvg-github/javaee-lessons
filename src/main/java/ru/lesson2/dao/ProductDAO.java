package ru.lesson2.dao;

import ru.lesson2.entity.Product;
import ru.lesson2.interceptor.LogInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.List;

@Stateless
@Interceptors({LogInterceptor.class})
public class ProductDAO extends AbstractDAO {

    public List<Product> getListProductByCategoryId(
            String categoryId
    ) {
        if (categoryId == null || categoryId.isEmpty()) return getListProduct();
        return em.createQuery("SELECT e FROM Product e WHERE e.category.id = :categoryId", Product.class)
                .setParameter("categoryId", categoryId).getResultList();
    }

    public List<Product> getListProduct() {
        return em.createQuery("SELECT e FROM Product e", Product.class).getResultList();
    }

    public void persist(Product product) {
        if (product == null) return;
        em.persist(product);
    }

    public Product getProductById(String id) {
        if (id == null) return null;
        return em.find(Product.class, id);
    }

    public Product getProductByName(String name) {
        if (name == null) return null;
        return em.find(Product.class, name);
    }

    public void merge(Product product) {
        if (product == null) return;
        em.merge(product);
    }

    public void removeProduct(String productId) {
        if (productId == null || productId.isEmpty()) return;
        Product product = em.find(Product.class, productId);
        em.remove(product);
    }

}
