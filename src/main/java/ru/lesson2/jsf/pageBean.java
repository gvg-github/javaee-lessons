package ru.lesson2.jsf;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="pageBean")
@SessionScoped
public class pageBean {

    final private String mainPage = "Main page";
    final private String catalogPage = "Catalog page";

    public String getCatalogPage() {
        return catalogPage;
    }

    public String getMainPage() {
        return mainPage;
    }
}
