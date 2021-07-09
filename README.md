# Game TIC- TAC- TOE

### OBJECTIVE:
This is final project for Java beginner course in program "She goes tech". 
It's main agenda is to showcase learned Java basic skills by creating game, including simple database using H2 Database Engine.

### GAME DESCRIPTION:
TIC- TAC- TOE is played by 2 players on 3 x 3 square game board by putting symbols " X " and " O " (one player uses only one symbol the whole time while playing).
Players take turns and place previously mentioned symbols aiming to place the same symbol 3 times in one line (horizontally, vertically or diagonally on
a game grid). First player who gets 3 marks in a row (horizontally, vertically or diagonally)- wins.

### GAME RULES:
1. Two players decide who starts the game.
2. Player 1 starts playing by placing " X " on a game board. Then Player 2 makes move by placing "O ".
3. Both players take turns and try to get 3 symbols in a line (either horizontally, vertically or diagonally) and also aims to block other player (not letting
opponent to place their mark 3 times in a row).
4. The outcome of the game is:
- Player who gets 3 symbols in a row ( either horizontally, vertically or diagonally) is the winner.
- If none of players can draw straight line and other places of the board is already filled in, then games resumes as a tie.

### IMPLEMENTED GAME LOGIC:
1. Game starts with a question: <b> "Do you want to play or see results?" p/r </b>

- <b>  r </b>- players choose to see results </b>, then result history from H2 database is shown ( results contain game ID, player names and winner name).

2. After seeing results player is asked <b>"Do you want to do something more?" y/n </b>
- <b> y </b>- game goes back to starting point and asks first question
- <b> n </b>- game exits 

3. <b> p </b>- player chooses to play game
- Player 1 enters name
- Player 2 enters name
- Game board 3 x 3 is printed on the screen
- Player 1 types one no. from 1-9 
<p> <i> IF Player enters no. out of mentioned scope, game says "Invalid input! Please enter 1-9: "  </p> </i>
<p> <i> IF Player enters already used no., game says "Your move is taken! Please try again: " </p> </i>

- Game board with symbol "X" is printed out
- Player 2 types no. from 1-9
- Game board with symbol "O" is printed out + shows previously placed "X"

<p> <i> IF there are three "X" or "O" in one line horizontally, vertically or diagonally, game says which player is winner. </p> </i>
<p> <i> IF "X" or "O" don't match in one line horizontally, vertically or diagonally, game says "It's a tie!" </p> </i>

4. After winner or a tie is announced, game says  <b> "Do you want to do something more?" y/n </b>
- <b> y </b> - game start from beginning
- <b> n </b>- game exits

### CODE:
Code is written in Java on IntellJ platform and database is created in H2 Database Engine.



