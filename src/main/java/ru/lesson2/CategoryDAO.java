package ru.lesson2;

import java.util.*;

public class CategoryDAO {

    private List<Category> categories = new ArrayList<>();

    public Collection<Category> getListCategory() {
        return categories;
    }

    public void merge(Category category) {
        if (category == null) return;
        if (categories.contains(category)){
            categories.remove(category);
            categories.add(category);
        }else{
            categories.add(category);
        }
    }

    public void removeCategory(Category category) {
        if (category == null) return;
        categories.remove(category);
    }
}
