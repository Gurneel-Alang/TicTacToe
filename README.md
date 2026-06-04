# Custom Project: Tic Tac Toe

This is a simple graphic user interface (GUI) for the game Tic Tac Toe using Java Swing,
and the Model-View-Controller (MVC) design pattern.

To run this GUI, simply fork this repo, clone it to your local machine (preferably IntelliJ IDEA),
and compile and run `Main.java`. The GUI works as stated:

- A label at the top states the current player, indicated by the letters X and O.
- A grid of buttons is displayed for alternating players to click. Once a player clicks a button, their corresponding letter is placed in it and no player can override it.
- The game ends when a player lines up their letter in a row, column, or diagonal. If the board is full and no such win condition is found, then the game ends in a tie.

More features/improvements may be added for decorative purposes or accessibility needs.