package com.example.S1D4.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("DRINK")
public class Drink extends Item {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public Drink(int calories, double price) {
        super(calories, price);
    }

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

