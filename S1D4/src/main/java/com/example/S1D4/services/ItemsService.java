package com.example.S1D4.services;

import com.example.S1D4.repositories.ItemsRepository;
import com.example.S1D4.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;


    public List<Item> getAllItems() {
        return itemsRepository.findAll();
    }

    public void saveItem(Item newItem) {

        try
        {
        itemsRepository.save(newItem);
        System.out.println("New item " + newItem + " saved successfully!");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
