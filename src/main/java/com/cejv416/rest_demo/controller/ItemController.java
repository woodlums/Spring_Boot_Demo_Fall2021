package com.cejv416.rest_demo.controller;

import com.cejv416.rest_demo.model.Item;
import com.cejv416.rest_demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getAllItems()
    {
        return itemRepository.findAll();
    }

    @PostMapping("/items")
    public Item createItem(@Valid @RequestBody Item item)
    {
        return itemRepository.save(item);
    }
}
