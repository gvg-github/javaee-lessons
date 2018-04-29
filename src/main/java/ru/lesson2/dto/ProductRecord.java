package ru.lesson2.dto;

import ru.lesson2.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRecord {

    public static List<ProductRecord> toList(List<Product> products) {
        if (products == null || products.isEmpty()) return Collections.emptyList();
        final List<ProductRecord> result = new ArrayList<>();
        for (final Product product : products) {
            if (product == null) continue;
            result.add(new ProductRecord(product));
        }
        return result;
    }

    private String id;
    private String name;
    private String categoryId;

    public ProductRecord(Product product) {
        id = product.getId();
        name = product.getName();
    }

    public ProductRecord() {

    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
