package ru.lesson2.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO {

    @PersistenceContext(unitName = "gvg-unit")
    protected EntityManager em;

}