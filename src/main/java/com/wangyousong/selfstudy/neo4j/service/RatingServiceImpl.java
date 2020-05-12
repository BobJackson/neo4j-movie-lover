package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.dao.ViewingRepository;
import com.wangyousong.selfstudy.neo4j.domain.Viewing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    private final UserService userService;
    private final MovieService movieService;
    private final ViewingRepository repository;

    public RatingServiceImpl(UserService userService, MovieService movieService, ViewingRepository repository) {
        this.userService = userService;
        this.movieService = movieService;
        this.repository = repository;
    }

    @Override
    public void rating(Integer star, Long userId, Long movieId){
        Viewing viewing = new Viewing();
        viewing.setStars(star);
        viewing.setUser(userService.findById(userId));
        viewing.setMovie(movieService.findById(movieId));
        repository.save(viewing);
    }

    @Override
    public Iterable<Viewing> findAll() {
        return repository.findAll();
    }
}
