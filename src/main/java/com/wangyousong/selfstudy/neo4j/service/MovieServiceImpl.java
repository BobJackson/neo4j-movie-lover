package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.dao.MovieRepository;
import com.wangyousong.selfstudy.neo4j.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Movie movie){
        repository.save(movie);
    }

    @Override
    public Movie findById(Long movieId) {
        return repository.findById(movieId).orElse(null);
    }
}
