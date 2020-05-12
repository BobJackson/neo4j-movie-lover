package com.wangyousong.selfstudy.neo4j.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.util.Set;

@NodeEntity
@Data
public class Movie {
    @Id
    private Long nodeId;

    @Property
    private String title;

    private Set<Viewing> views;
}
