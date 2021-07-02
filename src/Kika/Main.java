package Kika;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Do you want to play or see results? p/r");
                char play = scanner.next().charAt(0);
                scanner.nextLine();

                //while loop for allowing to play
                /*test*/

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

                    printBoard(board);

                    // asking for entering X and Y

                    System.out.println("Player 1, please enter 1-9 to place your X: ");
                    int playerX = scanner.nextInt();

                    // call valid method
                    if (valid() == true){

                    }
                    placing(board, playerX,1);
                    printBoard(board);
                    //call check won method

                    System.out.println("Player 2, please enter 1-9 to place your Y: ");
                    int playerY = scanner.nextInt();

                    placing(board, playerY,2);
                    printBoard(board);
                    //call check won method

                }
            }

            // method for printing out the game board
            public static void printBoard(char [] [] board) {
                for (char [] row: board) {
                    for (char c : row) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
            }

            //Method to check if won

            //Method check if valid move


            // method for placing X

            public static void placing (char [] [] board, int playerX, int p) {
                char s = 'X';
                if (p == 1){
                    s = 'X';
                } else if (p == 2){
                    s = '0';
                }
                switch (playerX) {
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

//            public static void placingX (char [] [] board, int playerX) {
//                switch (playerX) {
//                    case 1:
//                        board[1][1] = 'X';
//                        break;
//                    case 2:
//                        board[1][3] = 'X';
//                        break;
//                    case 3:
//                        board[1][5] = 'X';
//                        break;
//                    case 4:
//                        board[3][1] = 'X';
//                        break;
//                    case 5:
//                        board[3][3] = 'X';
//                        break;
//                    case 6:
//                        board[3][5] = 'X';
//                        break;
//                    case 7:
//                        board[5][1] = 'X';
//                        break;
//                    case 8:
//                        board[5][3] = 'X';
//                        break;
//                    case 9:
//                        board[5][5] = 'X';
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//            // method for placing Y
//
//            public static void placingY (char [] [] board, int playerY) {
//                switch (playerY){
//                    case 1:
//                        board [1] [1] = 'Y';
//                        break;
//                    case 2:
//                        board [1] [3] = 'Y';
//                        break;
//                    case 3:
//                        board [1] [5] = 'Y';
//                        break;
//                    case 4:
//                        board [3] [1] = 'Y';
//                        break;
//                    case 5:
//                        board [3] [3] = 'Y';
//                        break;
//                    case 6:
//                        board [3] [5] = 'Y';
//                        break;
//                    case 7:
//                        board [5] [1] = 'Y';
//                        break;
//                    case 8:
//                        board [5] [3] = 'Y';
//                        break;
//                    case 9:
//                        board [5] [5] = 'Y';
//                        break;
//                    default:
//                        break;
//                }
//
//            }


        }

