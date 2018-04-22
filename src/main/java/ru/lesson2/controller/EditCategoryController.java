package ru.lesson2.controller;

import ru.lesson2.dao.CategoryDAO;
import ru.lesson2.entity.Category;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class EditCategoryController extends AbstractController{

    private final String id = getParamString("id");

    @Inject
    private CategoryDAO categoryDAO;

    private Category category;

    @PostConstruct
    private void init() {
        category = categoryDAO.getCategoryById(id);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void addCategory() {
        categoryDAO.persist(new Category());
    }

    public void removeCategory(Category category) {
        categoryDAO.removeCategory(category.getId());
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categoryDAO.getListCategory());
    }

    public String save() {
        categoryDAO.merge(category);
        return "editAll";
    }

}
