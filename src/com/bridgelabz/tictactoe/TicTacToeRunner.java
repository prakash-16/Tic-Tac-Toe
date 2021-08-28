package com.bridgelabz.tictactoe;

public class TicTacToeRunner {

	public static void main(String[] args) {

		System.out.println("Welcome to tic tac toe game");
		TicTacToeGame tictactoe = new TicTacToeGame();
		Character []gameBoard = tictactoe.createBoard();
		char choiceOfUser = tictactoe.chooseLetter();
		if (choiceOfUser == 'X') {
			System.out.println("you have chose letter X and computer has got letter O");
		} else {
			System.out.println("you have chose letter O and computer has got letter X");
		}
		//tictactoe.showBoard(gameBoard);
		boolean result = tictactoe.isIndexIsFree(gameBoard, 5);
		if(result == true) {
			tictactoe.userMove(gameBoard,5);
			tictactoe.showBoard(gameBoard);
		}

	}

}
