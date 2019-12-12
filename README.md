# toy-robot

Toy robot simulator has been build using Java8 and Maven.

## to build
mvn clean verify

## to run the jar file
java -jar target/toy-robot-1.0.jar

```
Toy Robot Simulator

Command: place 0,0,NORTH
Command: move
Command: report
Output:0, 1, NORTH

Command: PLACE 0,0,NORTH
Command: left
Command: report
Output:0, 0, WEST

Command: place 1,2,EAST
Command: move
Command: move
Command: left
Command: move
Command: report
Output:3,3,NORTH
```
