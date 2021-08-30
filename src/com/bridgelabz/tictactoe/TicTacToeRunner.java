package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner {

	public static void main(String[] args) {
		int i = 0,j = 0,k = 1;
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
		if(choice.toLowerCase().equals(tossResult.toLowerCase())) {
			System.out.println("The result of toss is " + tossResult + " and you will go first");
			tictactoe.userMove(gameBoard);
			i++;
		}
		else {
			System.out.println("The result of toss is " + tossResult + " and you will go last");
			tictactoe.computerMove(gameBoard);
			j = j + 2;
		}
		while(k <= 9) {
			if(i > 0) {
				switch(1) {
				case 1:
					tictactoe.computerMove(gameBoard);
				case 2:
					tictactoe.userMove(gameBoard);
				}
				
			}
			if(j > 1) {
				switch(1) {
				case 1:
					tictactoe.userMove(gameBoard);
				case 2:
					tictactoe.computerMove(gameBoard);
				}
			}
			boolean resultWin = tictactoe.isWin(gameBoard);
			if(resultWin == true) {
				break;
			}
			boolean resultTie = tictactoe.isTie(gameBoard);
			if(resultTie == true) {
				break;
			}
			boolean resultCheckComputer = tictactoe.checkOpponentComputer(gameBoard);
			boolean resultCheckUser = tictactoe.checkOpponentUser(gameBoard);
			if(resultCheckComputer == true && resultCheckUser == true) {
				if(tictactoe.isIndexIsFree(gameBoard, 1)) {
					tictactoe.userMove(gameBoard);
				}
				else if(tictactoe.isIndexIsFree(gameBoard, 3)) {
					tictactoe.userMove(gameBoard);
				}
				else if(tictactoe.isIndexIsFree(gameBoard, 7)) {
					tictactoe.userMove(gameBoard);
				}
				else if(tictactoe.isIndexIsFree(gameBoard, 9)) {
					tictactoe.userMove(gameBoard);
				}
				else {
					tictactoe.addCenter(gameBoard);
				}
				break;
			}	
			boolean checkBoardIsFull = tictactoe.isBoardFull(gameBoard);
			if(checkBoardIsFull == true) {
				System.out.println("Game Board is full");
				break;
			}
			else {
				continue;
			}
			k++;
		}
		tictactoe.showBoard(gameBoard);
		
	}

}
