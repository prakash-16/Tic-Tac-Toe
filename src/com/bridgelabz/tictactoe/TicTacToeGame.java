package com.bridgelabz.tictactoe;

import java.util.*;

public class TicTacToeGame {

	private Character[] gameBoard = new Character[10];
	Scanner sc = new Scanner(System.in);
	public char user;
	public char computer;
	public int i;

	public Character[] createBoard() {
		for (i = 1; i < 10; i++) {
			gameBoard[i] = ' ';
		}
		return gameBoard;
	}

	public char chooseLetter() {
		System.out.println("1. X");
		System.out.println("2. O");
		System.out.println("Enter case number to choose letter:- ");
		int result = sc.nextInt();
		if (result == 1) {
			user = 'X';
			computer = 'O';
		} else {
			computer = 'O';
			user = 'X';
		}
		return user;

	}

	public void showBoard(Character[] gameBoard) {
		System.out.println("|" + gameBoard[1] + "|" + "|" + gameBoard[2] + "|" + "|" + gameBoard[3] + "|");
		System.out.println("|" + gameBoard[4] + "|" + "|" + gameBoard[5] + "|" + "|" + gameBoard[6] + "|");
		System.out.println("|" + gameBoard[7] + "|" + "|" + gameBoard[8] + "|" + "|" + gameBoard[9] + "|");
		
	}

	public boolean isIndexIsFree(Character[] gameBoard, int position) {
		if (position > 9) {
			System.out.println("Please enter valid index from (1-9)");
			return false;
		}
		if (gameBoard[position] == ' ') {
			return true;
		} else {
			System.out.println("Index is not free");
			return false;
		}
	}

	public void userMove(Character[] gameBoard, int position) {
		boolean result = isIndexIsFree(gameBoard, position);
		if (result == true) {
			gameBoard[position] = user;
		}
	}

}
