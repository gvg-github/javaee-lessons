package ru.lesson2.entity;


import javax.persistence.Entity;
import java.util.Date;

@Entity
public class ShopOrder extends AbstractEntity {

    private int number = 0;
    private Date date;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
