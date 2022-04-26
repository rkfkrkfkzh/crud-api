package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.User;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends DemoApplicationTests {

    //    Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
//String sql = insert into user (%s, %s, %d) value (account, email, age);
        User user = new User();
        user.setAccount("TestUser02");
        user.setEmail("TestUser02@gmail.com");
        user.setPhoneNumber("010-2222-2222");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin2");

        User newUser = userRepository.save(user);
        System.out.println("newUser :" + newUser);
    }

    @Test
    public void read() {
        Optional<User> user = userRepository.findById(2);

        user.ifPresent(selectUser -> {
            System.out.println("user : " + selectUser);
            System.out.println("email : " + selectUser.getEmail());
        });
    }

    @Test
    @Transactional
    public void update() {
        Optional<User> user = userRepository.findById(2);
        user.ifPresent(selectUser -> {
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setCreatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

    @Test
    @Transactional
    public void delete() {
        Optional<User> user = userRepository.findById(3);

        Assert.assertTrue(user.isPresent());

        user.ifPresent(selectUser -> {
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(3);
        Assert.assertFalse(deleteUser.isPresent());

    }
}