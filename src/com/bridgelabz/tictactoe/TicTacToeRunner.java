package com.bridgelabz.tictactoe;

public class TicTacToeRunner {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Welcome to tic tac toe game");
		TicTacToeGame tictactoe = new TicTacToeGame();
		Character[] gameBoard = tictactoe.createBoard();
		char choiceOfUser = tictactoe.chooseLetter();
		if (choiceOfUser == 'X') {
			System.out.println("you have chose letter X and computer has got letter O");
		} else {
			System.out.println("you have chose letter O and computer has got letter X");
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
