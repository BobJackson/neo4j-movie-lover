package com.wangyousong.selfstudy.neo4j.dao;

import com.wangyousong.selfstudy.neo4j.domain.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User,Long> {
}
