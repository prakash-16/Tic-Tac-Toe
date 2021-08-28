package com.bridgelabz.tictactoe;

import java.util.*;

public class TicTacToeGame {

	private Character[] gameBoard = new Character[10];
	Scanner sc = new Scanner(System.in);
	public char user;
	public char computer;

	public void createBoard() {
		for (int i = 1; i < 10; i++) {
			gameBoard[i] = ' ';
		}
	}

	public char chooseLetter() {
		System.out.println("1. X");
		System.out.println("2. O");
		System.out.println("Enter case number to choose letter:- ");
		int result = sc.nextInt();
		if (result == 1) {
			user = 'X';
		} else {
			computer = 'O';
		}
		return user;

	}

}
