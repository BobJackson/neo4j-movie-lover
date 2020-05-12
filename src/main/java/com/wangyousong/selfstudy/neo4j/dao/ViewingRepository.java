package com.wangyousong.selfstudy.neo4j.dao;

import com.wangyousong.selfstudy.neo4j.domain.Viewing;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ViewingRepository extends Neo4jRepository<Viewing,Long> {
}
