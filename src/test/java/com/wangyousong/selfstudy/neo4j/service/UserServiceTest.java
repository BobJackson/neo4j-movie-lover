package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    void saveJohn() {
        User john = new User();
        john.setName("John Johnson");
        john.setNodeId(1L);
        service.save(john);
    }

    @Test
    void saveKate() {
        User kate = new User();
        kate.setName("Kate Smith");
        kate.setNodeId(2L);
        service.save(kate);
    }

    @Test
    void saveJack(){
        User jack = new User();
        jack.setName("Jack Jeffries");
        jack.setNodeId(3L);
        service.save(jack);
    }

    @Test
    void addFriend() {
        User savedJohn = service.findById(1L);
        User savedKate = service.findById(2L);
        User savedJack = service.findById(3L);

        // try to persist the relationship
        savedJohn.addFriends(savedKate);
        savedJohn.addFriends(savedJack);
        service.save(savedJohn);
        queryJohn();
    }


    @Test
    void queryJohn(){
        User user = service.findById(1L);
        System.out.println(user);
    }

    @Test
    void deleteJohnAndKate(){
        service.deleteById(1L);
        service.deleteById(2L);
    }
}