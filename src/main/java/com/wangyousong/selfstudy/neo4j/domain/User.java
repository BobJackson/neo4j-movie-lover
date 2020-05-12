package com.wangyousong.selfstudy.neo4j.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.*;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

import static org.neo4j.ogm.annotation.Relationship.DIRECTION;

@NodeEntity
@Data
public class User {
    @Id
    private Long nodeId;

    @Property
    private String name;

    @Relationship(type = "IS_FRIEND_OF",direction = DIRECTION)
    private Set<User> friends;


    public void addFriends(User friend) {
        if(CollectionUtils.isEmpty(friends)){
            friends = new HashSet<>();
        }
        friends.add(friend);
    }
}
