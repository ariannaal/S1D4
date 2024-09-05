package com.example.S1D4.entities;

import jakarta.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public Item() {

    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }
}
