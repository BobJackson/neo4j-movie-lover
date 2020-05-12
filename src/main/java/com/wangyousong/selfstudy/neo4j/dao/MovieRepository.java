package com.wangyousong.selfstudy.neo4j.dao;

import com.wangyousong.selfstudy.neo4j.domain.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
}
