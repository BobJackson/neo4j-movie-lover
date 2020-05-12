package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.domain.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieServiceTest {

    @Autowired
    private MovieService service;

    @Test
    void saveFargo() {
        Movie movie = new Movie();
        movie.setNodeId(1L);
        movie.setTitle("Fargo");
        service.save(movie);
    }

    @Test
    void saveHeat() {
        Movie movie = new Movie();
        movie.setNodeId(2L);
        movie.setTitle("Heat");
        service.save(movie);
    }

    @Test
    void saveAlien(){
        Movie movie = new Movie();
        movie.setNodeId(3L);
        movie.setTitle("Alien");
        service.save(movie);
    }
}