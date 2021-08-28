package com.bridgelabz.tictactoe;

public class TicTacToeGame {

	private Character[] gameBoard = new Character[10];

	public void createBorad() {
		for(int i=1;i<10;i++) {
			gameBoard[i] = ' ';
		}
	}

}
