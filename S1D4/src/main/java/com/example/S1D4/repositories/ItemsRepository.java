package com.example.S1D4.repositories;

import com.example.S1D4.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Item, Long> {

    @Query("SELECT i FROM Item i WHERE i.price <= 15")
    List<Item> filterSoloSotto15();

}
