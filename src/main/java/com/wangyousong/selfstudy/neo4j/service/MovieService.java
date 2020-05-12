package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.domain.Movie;

public interface MovieService {
    void save(Movie movie);

    Movie findById(Long movieId);
}
