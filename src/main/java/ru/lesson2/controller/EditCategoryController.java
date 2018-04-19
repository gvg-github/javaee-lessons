package ru.lesson2.controller;

import ru.lesson2.Category;
import ru.lesson2.Product;
import ru.lesson2.ProductDAO;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class EditCategoryController extends AbstractController {

    private final String id = getParamString("id");

    //@Inject

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category= category;
    }

    public String save() {
        return "editAll";
    }
}
