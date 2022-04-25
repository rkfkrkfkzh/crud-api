package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends DemoApplicationTests {

    //    Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
//String sql = insert into user (%s, %s, %d) value (account, email, age);
        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-3333-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin3");

        User newUser = userRepository.save(user);
        System.out.println("newUser :" + newUser);
    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

}
