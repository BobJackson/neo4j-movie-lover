package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.dao.UserRepository;
import com.wangyousong.selfstudy.neo4j.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public User findById(long id) {
        return repository.findById(id).orElse(null);
    }
}
