package com.example.S1D4.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "pizza")
@Entity
public class Pizza extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(name="pizza_toppings",
    joinColumns = @JoinColumn(name= "pizza_id"),
    inverseJoinColumns = @JoinColumn(name = "topping_id"))

    private List<Topping> toppingList;

    private boolean isXl = false;

    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(700, 4.3);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
    }

    public String getName() {
        return name;
    }

    @ManyToMany
    public List<Topping> getToppingList() {
        return toppingList;
    }

    public boolean isXl() {
        return isXl;
    }

    @Override
    public int getCalories() {
        return super.getCalories() + this.getToppingList().stream().mapToInt(Topping::getCalories).sum();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.getToppingList().stream().mapToDouble(Topping::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", toppingList=" + toppingList +
                ", isXl=" + isXl +
                '}';
    }
}

