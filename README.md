# 🎳 Bowling-Game

## Description
This project is a simple bowling game simulation implemented in Java. The game allows up to 6 players to compete, calculates their scores based on the rules of bowling (including strikes and spares), and determines the winner at the end of the game.

## Features
* Up to 6 players can play.
* Handles scoring for all 10 frames of a bowling game.
* Implements bowling rules for calculating points for strikes and spares.
* Provides feedback on the number of pins knocked down in each attempt.
* Displays the final score for each player and announces the winner.

## How to Run the Game
* 1 Clone or download the repository to your local machine.
* 2 Compile the Java files:

```bash
javac application/ProgramBowling.java entities/Game.java entities/Numbers.java
``` 

* 3 Run the application:

```bash
java application.ProgramBowling
```

* 4 Follow the instructions in the console to enter the number of players and their names.

* 5 For each player's turn, enter the number of pins knocked down on the first and (if necessary) second attempt.

## Game Rules Implemented

* Strike: If a player knocks down all 10 pins on the first try of a frame, it’s a strike. The score for that frame will include the points from the next two attempts.

* Spare: If a player knocks down all 10 pins in two attempts, it’s a spare. The score for that frame will include the points from the next attempt.

* Extra Moves for the 10th Frame: Players can earn up to two extra moves in the final frame depending on whether they score a strike or spare.

## Code Structure

* `ProgramBowling.java: ` Contains the main program logic and handles user input.

* `Game.java: ` Manages the game logic, including scoring and frame management.

* ` Numbers.java: ` Utility class for checking the number of remaining pins and displaying feedback.
