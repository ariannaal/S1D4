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

    public Item saveItem(Item item) {
        return itemsRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemsRepository.findAll();
    }

//    public List<Item> getItemsUnderPrice(double price) {
//        return itemRepository.filterSoloSotto15();
//    }
}
