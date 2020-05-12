package com.wangyousong.selfstudy.neo4j.service;

import com.wangyousong.selfstudy.neo4j.domain.User;

public interface UserService {

    void save(User user);

    void deleteById(long id);

    User findById(long id);

}
