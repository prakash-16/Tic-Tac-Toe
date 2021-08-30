package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner {

	public static void main(String[] args) {
		int k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to tic tac toe game");
		TicTacToeGame tictactoe = new TicTacToeGame();
		Character[] gameBoard = tictactoe.createBoard();
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
		while(k <= 9) {
			tictactoe.userMove(gameBoard);
			boolean resultWin = tictactoe.isWin(gameBoard);
			if(resultWin == true) {
				break;
			}
			boolean resultTie = tictactoe.isTie(gameBoard);
			if(resultTie == true) {
				break;
			}
			k++;
		}
		tictactoe.showBoard(gameBoard);
		
	}

}
