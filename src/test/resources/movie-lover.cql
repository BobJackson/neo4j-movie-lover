-- you can use this script to verify the java code implementation effects
MATCH (john{name: 'John Johnson'}) -[r:HAS_SEEN]->(m)
return john,r,m;

MATCH (kate{name: 'Kate Smith'}) -[r:HAS_SEEN]->(m)
return kate,r,m;

MATCH p=()-[r:`HAS_SEEN`]->() RETURN p LIMIT 25;

-- to clean up
match (n) detach delete n;