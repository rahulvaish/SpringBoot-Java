Start Neo4J:

```
docker run \
  --name my-neo4j-container2 \
  --publish=7474:7474 --publish=7687:7687 \
  --env NEO4J_AUTH=neo4j/password \
  --volume=$HOME/neo4j/data:/data \
  neo4j:latest

```
Neo4J started:
<img width="1259" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/c5ec7cb9-1a2c-426b-880b-c216a72cd08d">



<img width="1299" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/c95209ff-4fcd-49b0-99be-759c652fde0b">


<img width="1728" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/6cb77bf7-8184-4544-98ec-4c0ae390576f">
