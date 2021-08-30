package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner {

	public static void main(String[] args) {
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to tic tac toe game");
		TicTacToeGame tictactoe = new TicTacToeGame();
		Character[] gameBoard = tictactoe.createBoard();
		tictactoe.toss();
		char choiceOfUser = tictactoe.chooseLetter();
		if (choiceOfUser == 'X') {
			System.out.println("you have chose letter X and computer has got letter O");
		} else {
			System.out.println("you have chose letter O and computer has got letter X");
		}
		System.out.println("Enter the side of coin you want :- ");
		System.out.println("Head");
		System.out.println("Tail");
		String choice = sc.nextLine();
		String tossResult = tictactoe.toss();
		if(choice.toLowerCase().equals(tossResult.toLowerCase())) {
			System.out.println("The result of toss is " + tossResult + " and you will go first");
		}
		else {
			System.out.println("The result of toss is " + tossResult + " and you will go last");
		}
		while(i <= 9) {
			boolean result = tictactoe.isIndexIsFree(gameBoard);
			if (result == true) {
				System.out.println("Free space is avaliable");
				tictactoe.userMove(gameBoard);
			} else {
				System.out.println("Free space is not avaliable");
			}
			tictactoe.showBoard(gameBoard);
		}
	}

}
