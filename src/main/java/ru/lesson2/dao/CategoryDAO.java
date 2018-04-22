package ru.lesson2.dao;

import ru.lesson2.entity.Category;

import javax.ejb.Stateless;
import java.util.*;

@Stateless
public class CategoryDAO extends AbstractDAO{

    public List<Category> getListCategory() {
        return em.createQuery("SELECT e FROM Category e", Category.class).getResultList();
    }

    public void persist(Category category) {
        if (category == null) return;
        em.persist(category);
    }

    public Category getCategoryById(String id) {
        if (id == null) return null;
        return em.find(Category.class, id);
    }

    public void merge(Category category) {
        if (category == null) return;
        em.merge(category);
    }

//    public void removeProduct(Product product) {
//        if (product == null) return;
//        em.remove(product);
//    }

    public void removeCategory(String categoryId) {
        if (categoryId == null || categoryId.isEmpty()) return;
        Category category = em.find(Category.class, categoryId);
        em.remove(category);
    }
}
