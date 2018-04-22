package ru.lesson2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Category extends AbstractEntity{

    @Column(nullable = false, columnDefinition = "TEXT")
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
