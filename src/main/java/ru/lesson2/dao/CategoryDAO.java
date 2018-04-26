package ru.lesson2.dao;

import ru.lesson2.entity.Category;
import ru.lesson2.entity.Product;
import ru.lesson2.interceptor.LogInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;

@Stateless
@Interceptors({LogInterceptor.class})
public class CategoryDAO extends AbstractDAO{

    public List<Category> getListCategory() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Category> query = cb.createQuery(Category.class);
        Root<Category> c = query.from(Category.class);
        query.select(c);
        return em.createQuery(query).getResultList();
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
