package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.domain.Viewing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RatingServiceTest {

    @Autowired
    private RatingService service;


    @Test
    void johnRateFargo() {
        service.rating(5, 1L, 1L);
    }

    @Test
    void kateRateHeat() {
        service.rating(3, 2L, 2L);
    }

    @Test
    void jackRateFargo() {
        service.rating(4, 3L, 1L);
    }

    @Test
    void jackRateAlien() {
        service.rating(5, 3L, 3L);
    }


    @Test
    public void listAll(){
        Iterable<Viewing> views = service.findAll();
        views.forEach(System.out::println);
    }
}