package Kika;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    static ArrayList <Integer> playerMoves = new ArrayList <Integer> ();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play or see results? p/r");
        char play = scanner.next().charAt(0);
        scanner.nextLine();


        while (play == 'p') {
            System.out.println("Please enter Player's 1 name: ");
            String player1 = scanner.nextLine();

            System.out.println("Please enter Player's 2 name: ");
            String player2 = scanner.nextLine();


            // Designing a game board

            char[][] board = {{'-', '-', '-', '-', '-', '-', '-'},
                    {'|', ' ', '|', ' ', '|', ' ', '|'},
                    {'|', '-', '+', '-', '+', '-', '|'},
                    {'|', ' ', '|', ' ', '|', ' ', '|'},
                    {'|', '-', '+', '-', '+', '-', '|'},
                    {'|', ' ', '|', ' ', '|', ' ', '|'},
                    {'-', '-', '-', '-', '-', '-', '-'}};


            boolean gameEnded = false;

            printBoard(board);

            while (!gameEnded) {

                // asking Player 1 for entering X

                System.out.println("Player 1, please enter 1-9 to place your X: ");
                int playerXO = scanner.nextInt();

                // check if the move is valid

                while (playerXO < 0 || playerXO > 9 || playerMoves.contains(playerXO)) {
                    System.out.println("This is invalid move! Please try again");
                    playerXO = scanner.nextInt();
                }

                placing(board, playerXO, 1);
                printBoard(board);

                // checking for the Game result

                if (checkResult(board) == 'X') {
                    System.out.println("Player 1 has won!");
                    gameEnded = true;

                } else if (checkResult(board) == '0') {
                    System.out.println("Player 2 has won!");
                    gameEnded = true;
                } else {

                    if (outOfMoves(board)) {
                        System.out.println("It's a tie!");
                        gameEnded = true;
                    }
                }


                // asking Player 2 for entering O

                if (!gameEnded) {
                    System.out.println("Player 2, please enter 1-9 to place your O: ");
                    playerXO = scanner.nextInt();

                    // check if the move is valid

                    while (playerXO < 0 || playerXO > 9 || playerMoves.contains(playerXO)) {
                        System.out.println("This is invalid move! Please try again");
                        playerXO = scanner.nextInt();
                    }

                    placing(board, playerXO, 2);
                    printBoard(board);

                    // check for the game result - winner or tie

                    if (checkResult(board) == 'X') {
                        System.out.println("Player 1 has won!");
                        gameEnded = true;

                    } else if (checkResult(board) == '0') {
                        System.out.println("Player 2 has won!");
                        gameEnded = true;
                        //If neither player has won, check to see if there has been a tie (if the board is full)
                    } else if (outOfMoves(board)) {
                        System.out.println("It's a tie!");
                        gameEnded = true;
                    }

                }

            }
        }
    }




// method for printing out the game board

    public static void printBoard ( char[][] board){
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // Method for validating input

    // method for placing X and Y

    public static void placing ( char[][] board, int playerXO, int p){
        char s = 'X';
        if (p == 1) {
            s = 'X';
            playerMoves.add(playerXO);
        } else if (p == 2) {
            s = '0';
            playerMoves.add(playerXO);
        }
        switch (playerXO) {
            case 1:
                board[1][1] = s;
                break;
            case 2:
                board[1][3] = s;
                break;
            case 3:
                board[1][5] = s;
                break;
            case 4:
                board[3][1] = s;
                break;
            case 5:
                board[3][3] = s;
                break;
            case 6:
                board[3][5] = s;
                break;
            case 7:
                board[5][1] = s;
                break;
            case 8:
                board[5][3] = s;
                break;
            case 9:
                board[5][5] = s;
                break;
            default:
                break;
        }
    }



    //Method to check if won

    public static char checkResult ( char[][] board){

        //Check each row
        for (int i = 1; i < 6; i += 2) {
            if (board[i][1] == board[i][3] && board[i][3] == board[i][5] && board[i][1] != '-') {
                return board [i][1];
            }
        }

        //Check each column
        for (int j = 1; j < 6; j += 2) {
            if (board[1][j] == board[3][j] && board[3][j] == board[5][j] && board[1][j] != '-') {
                return board[1][j];
            }
        }

        //Check the diagonals
        if (board[1][1] == board[3][3] && board[3][3] == board[5][5] && board[1][1] != '-') {
            return board[1][1];
        }
        if (board[1][5] == board[3][3] && board[3][3] == board[5][1] && board[1][5] != '-') {
            return board[1][5];
        }

        //Otherwise nobody has not won yet
        return ' ';

    }

    public static boolean outOfMoves (char[][] board){
        for (int i = 1; i < 6; i += 2) {
            for (int j = 1; j < 6; j += 2) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

}



