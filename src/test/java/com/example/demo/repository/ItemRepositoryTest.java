package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.Item;
import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class ItemRepositoryTest extends DemoApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {
        Item item = new Item();
        item.setName("휴대폰");
        item.setPrice(100000);
        item.setContent("애플폰");

        Item newItem = itemRepository.save(item);
        Assert.assertNotNull(newItem);
    }

    @Test
    public void read() {
        Integer id = 1;
        Optional<Item> item = itemRepository.findById(id);

        Assert.assertTrue(item.isPresent());


    }
}
