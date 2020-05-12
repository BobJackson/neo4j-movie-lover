package com.wangyousong.selfstudy.neo4j.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_SEEN")
@Data
public class Viewing {

    @Id
    @GeneratedValue
    private Long nodeId;

    @Property
    private Integer stars;

    @StartNode
    private User user;

    @EndNode
    private Movie movie;



}
