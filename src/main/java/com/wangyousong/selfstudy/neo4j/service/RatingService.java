package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.domain.Viewing;

import java.util.List;

public interface RatingService {
    void rating(Integer star, Long userId, Long movieId);

    Iterable<Viewing> findAll();
}
