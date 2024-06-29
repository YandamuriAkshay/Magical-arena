# Magical Arena

## Overview
This project simulates a magical arena where two players engage in turn-based combat until one of them loses all their health. Players attack and defend based on their attributes and dice rolls, aiming to reduce their opponent's health to zero.

## Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Apache Maven

## Project Structure
The project is structured as follows:

project-root/
src/
  main/
    java/
      com/
        magicalarena/
          Player.java       # Defines Player class with health, strength, and attack attributes.
          Dice.java         # Simulates a 6-sided dice roll.
          Arena.java        # Implements the logic for player turns and combat in the arena.
          Game.java         # Main class to start and run the game.
  test/
    java/
      com/
        magicalarena/
          PlayerTest.java   # Unit tests for Player class.
          DiceTest.java     # Unit tests for Dice class.
          ArenaTest.java    # Unit tests for Arena class.
          GameTest.java     # Unit tests for Game class.
lib/                        # (Optional) Libraries for testing (JUnit, Hamcrest).
bin/                        # (Generated) Compiled Java classes.
.gitignore                  # Specifies files to be ignored by Git.
README.md                   # This file. Provides project overview, setup instructions, and details.



## How to Run

### Compile the Code
1. Open a terminal or command prompt.
2. Navigate to the project root directory where `src` and `test` folders are located.

#### Using Command Line
- Compile the Java files:

  javac -d bin src/main/java/com/magicalarena/*.java


### Run the Game
1. After compiling, run the game using:

   java -cp bin com.magicalarena.Game


### Run Tests
1. **JUnit Tests**:
   - Ensure JUnit and Hamcrest libraries are downloaded and placed in a `lib` directory.
   - Compile the test files:

     javac -d bin -cp lib/junit-platform-console-standalone-1.7.1.jar src/test/java/com/magicalarena/*.java

   - Run the tests:

     java -jar lib/junit-platform-console-standalone-1.7.1.jar
