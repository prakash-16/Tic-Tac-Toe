package com.bridgelabz.tictactoe;

import java.util.*;

public class TicTacToeGame {

	private Character[] gameBoard = new Character[10];
	Scanner sc = new Scanner(System.in);
	public char user;
	public char computer;
	public int position = 0;
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
			computer = 'X';
			user = 'O';
		}
		return user;

	}

	public void showBoard(Character[] gameBoard) {
		System.out.println("|" + gameBoard[1] + "|" + "|" + gameBoard[2] + "|" + "|" + gameBoard[3] + "|");
		System.out.println("|" + gameBoard[4] + "|" + "|" + gameBoard[5] + "|" + "|" + gameBoard[6] + "|");
		System.out.println("|" + gameBoard[7] + "|" + "|" + gameBoard[8] + "|" + "|" + gameBoard[9] + "|");

	}

	public boolean isIndexIsFree(Character[] gameBoard) {
		while (true) {
			System.out.println("Enter the position to take move :- ");
			position = sc.nextInt();
			if (position > 9) {
				System.out.println("Please enter valid index from (1-9)");
			}
			if (gameBoard[position] == ' ') {
				return true;
			} else {
				System.out.println("Index is not free");
			}
		}

	}

	public void userMove(Character[] gameBoard) {
		gameBoard[position] = user;
	}

}
