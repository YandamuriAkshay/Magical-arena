# Magical Arena

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven (optional, for managing dependencies and running tests)

### Compile and Run
1. Compile the code:
    ```sh
    javac -d bin src/main/java/com/magicalarena/*.java
    ```

2. Run the game:
    ```sh
    java -cp bin com.magicalarena.Game
    ```

### Run Tests
1. Compile the test code:
    ```sh
    javac -d bin -cp lib/junit-5.7.0.jar:src/test/java src/test/java/com/magicalarena/*.java
    ```

2. Run the tests:
    ```sh
    java -cp bin:lib/junit-5.7.0.jar org.junit.runner.JUnitCore com.magicalarena.PlayerTest com.magicalarena.DiceTest com.magicalarena.ArenaTest
    ```

## Project Structure
src/
main/
java/
com/magicalarena/
Player.java
Dice.java
Arena.java
Game.java
test/
java/
com/magicalarena/
PlayerTest.java
DiceTest.java
ArenaTest.java
GameTest.java


## Description
This project simulates a magical arena where two players fight until one of them dies. Players attack in turns, and the damage dealt is calculated based on their attack and strength attributes along with dice rolls.