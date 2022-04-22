package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
public class UserRepositoryTest extends DemoApplicationTests {

    //    Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
//String sql = insert into user (%s, %s, %d) value (account, email, age);
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

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
