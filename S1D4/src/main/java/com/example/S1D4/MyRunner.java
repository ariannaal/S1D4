package com.example.S1D4;


import com.example.S1D4.entities.Drink;
import com.example.S1D4.entities.Pizza;
import com.example.S1D4.entities.Topping;
import com.example.S1D4.repositories.ItemsRepository;
import com.example.S1D4.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private ItemsService itemsService;

    @Override
    public void run(String... args) throws Exception {

        // Create items
        List<Topping> toppings = new ArrayList<>();
        Topping cheese = new Topping("Cheese", 20, 2.5);
        Topping tomato = new Topping("Tomato", 100, 1.5);
        toppings.add(cheese);
        toppings.add(tomato);

        Pizza pizza = new Pizza("Pizza Margherita", toppings, false);

        Drink lemonade = new Drink("Lemonade", 128, 1.29);
        Drink water = new Drink("Water", 0, 1.29);
        Drink wine = new Drink("Wine", 607, 7.49);

        // Save items using the service

        for (int i = 0; i < toppings.size(); i++) {
        itemsService.saveItem(toppings.get(i));

        }
        itemsService.saveItem(pizza);
        itemsService.saveItem(lemonade);
        itemsService.saveItem(water);
        itemsService.saveItem(wine);

    }
}
