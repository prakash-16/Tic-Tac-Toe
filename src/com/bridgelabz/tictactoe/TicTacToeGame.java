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

	public boolean isIndexIsFree(Character[] gameBoard, int position) {
		if (position > 9 || position < 1) {
			System.out.println("Please enter valid index from (1-9)");
		}
		if (gameBoard[position] == ' ') {
			return true;
		} else {
			System.out.println("Index is not free");
		}
		return false;
	}

	public void userMove(Character[] gameBoard) {
		while (true) {
			System.out.println("Enter the position to take move :- ");
			if (this.isIndexIsFree(gameBoard, position) == true) {
				break;
			}
		}
		gameBoard[position] = user;
	}

	public void computerMove(Character[] gameBoard) {
		while (true) {
			position = (int) Math.floor(Math.random()*(9-1+1)+1);
			System.out.println(position);
			if (this.isIndexIsFree(gameBoard, position) == true) {
				break;
			}
		}
		gameBoard[position] = computer;
	}

	public String toss() {
		int tossResult = (int) Math.floor(Math.random() * 10) % 2;
		if (tossResult == 1) {
			return "Head";
		} else {
			return "Tail";
		}
	}

	public boolean isWin(Character[] gameBoard) {
		if (gameBoard[1] == gameBoard[5] && gameBoard[5] == gameBoard[9] && gameBoard[9] != ' ') {
			System.out.println(gameBoard[5] + " has won the game");
			return true;
		} else if (gameBoard[3] == gameBoard[5] && gameBoard[5] == gameBoard[7] && gameBoard[7] != ' ') {
			System.out.println(gameBoard[5] + " has won the game");
			return true;
		} else if (gameBoard[4] == gameBoard[5] && gameBoard[5] == gameBoard[6] && gameBoard[6] != ' ') {
			System.out.println(gameBoard[5] + " has won the game");
			return true;
		} else if (gameBoard[2] == gameBoard[5] && gameBoard[5] == gameBoard[8] && gameBoard[8] != ' ') {
			System.out.println(gameBoard[5] + " has won the game");
			return true;
		} else if (gameBoard[1] == gameBoard[4] && gameBoard[4] == gameBoard[7] && gameBoard[7] != ' ') {
			System.out.println(gameBoard[4] + " has won the game");
			return true;
		} else if (gameBoard[3] == gameBoard[6] && gameBoard[6] == gameBoard[9] && gameBoard[9] != ' ') {
			System.out.println(gameBoard[6] + " has won the game");
			return true;
		} else if (gameBoard[1] == gameBoard[2] && gameBoard[2] == gameBoard[3] && gameBoard[3] != ' ') {
			System.out.println(gameBoard[2] + " has won the game");
			return true;
		} else if (gameBoard[7] == gameBoard[8] && gameBoard[8] == gameBoard[9] && gameBoard[9] != ' ') {
			System.out.println(gameBoard[8] + " has won the game");
			return true;
		}
		return false;
	
	}

	public boolean isTie(Character[] gameBoard) {
		for (i = 1; i <= 9; i++) {
			if (gameBoard[i] == ' ') {
				return false;
			}
		}
		System.out.println("Game tied");
		return true;
	}
	
	public boolean checkOpponentComputer(Character[] gameBoard) {
		for(i =1;i<gameBoard.length;i++) {
			if(gameBoard[i] == ' ') {
				gameBoard[i] = user;
				if(isWin(gameBoard)) {
					userMove(gameBoard);
					return true;
				}
				else {
					gameBoard[i] = ' ';
				}
			}
		}
		return false;
	}
	
	public void addCenter(Character[] gameBoard) {
		if (this.isIndexIsFree(gameBoard, position) == true) {
			gameBoard[position] = computer;
		}
	}
	
	public boolean checkOpponentUser(Character[] gameBoard) {
		for(i =1;i<gameBoard.length;i++) {
			if(gameBoard[i] == ' ') {
				gameBoard[i] = user;
				if(isWin(gameBoard)) {
					return true;
				}
				else {
					gameBoard[i] = ' ';
				}
			}
		}
		return false;
	}

}
