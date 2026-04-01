package com.JavaTask;

	// code for Tic Toc Toe Game

	import java.util.Scanner;

	public class TicTacToeGame {

	    static char[][] board = new char[3][3];
	    static Scanner s = new Scanner(System.in);

	    public static void main(String[] args) {

	        char playAgain;

	        do {
	            initializeBoard();
	            playGame();

	            System.out.print("Do you want to play again? (y/n): ");
	            playAgain = s.next().charAt(0);

	        } while (playAgain == 'y' || playAgain == 'Y');

	        System.out.println("Thank you for playing this game ");
	        s.close();
	    }

	    static void initializeBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = ' ';
	            }
	        }
	    }

	    static void playGame() {
	        char currentPlayer = 'X';
	        boolean gameEnded = false;

	        for (int turn = 0; turn < 9 && !gameEnded; turn++) {
	            printBoard();
	            System.out.println("Player " + currentPlayer + " turn");

	            System.out.print("Enter row (0-2): ");
	            int row = s.nextInt();
	            System.out.print("Enter column (0-2): ");
	            int col = s.nextInt();

	            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
	                System.out.println("Invalid move! Try again.");
	                turn--;
	                continue;
	            }

	            board[row][col] = currentPlayer;

	            if (checkWin(currentPlayer)) {
	                printBoard();
	                System.out.println("Player " + currentPlayer + " wins!");
	                gameEnded = true;
	            } else {
	                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	            }
	        }

	        if (!gameEnded) {
	            printBoard();
	            System.out.println("Game Draw!");
	        }
	    }

	    static void printBoard() {
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }
	            System.out.println("\n-------------");
	        }
	    }

	    static boolean checkWin(char player) {

	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
	                return true;

	            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
	                return true;
	        }

	        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
	            return true;

	        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
	            return true;

	        return false;
	    }
	}


