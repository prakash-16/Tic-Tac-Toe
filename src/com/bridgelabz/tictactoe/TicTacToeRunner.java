package com.bridgelabz.tictactoe;

public class TicTacToeRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to tic tac toe game");
		TicTacToeGame tictactoe = new TicTacToeGame();
		tictactoe.createBoard();
		char choiceOfUser = tictactoe.chooseLetter();
		if(choiceOfUser == 'X') {
			System.out.println("you have chose letter X and computer has got letter O");
		}
		else {
			System.out.println("you have chose letter O and computer has got letter X");
		}
		

	}

}
