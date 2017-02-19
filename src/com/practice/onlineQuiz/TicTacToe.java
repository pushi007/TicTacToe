package com.practice.onlineQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
	private static int board[][] = new int[3][3];

	public static String choice = null;
	private static int currentPlayer = 0;

	public static void main(String s[]) {

		while (true) {
			System.out.println("Your Move: ");
			Scanner in = new Scanner(System.in);
			String pos = in.nextLine();
			board[Integer.parseInt(pos.split(" ")[0])][Integer.parseInt(pos.split(" ")[1])] = 1;
			currentPlayer = 2;
			int score = minimax(board, 2);
			System.out.println("score: " + score + " " + "choice: " + choice);
			board[Integer.parseInt(choice.split(" ")[0])][Integer.parseInt(choice.split(" ")[1])] = 2;
			if (checkGameOver(board)) {
				int scoreFinal = calculateScore(board, 0);
				if (scoreFinal == 10) {
					System.out.println("Computer wins!!");
				} else if (scoreFinal == -10)
					System.out.println("You win!!");
				else {
					System.out.println("Match is tie!!");
				}
				break;
			}
		}
	}

	public static int minimax(int board[][], int turn) {

		if (checkGameOver(board)) {
			return calculateScore(board, turn);
		}

		List<Integer> scores = new ArrayList<>();
		List<String> moves = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 0) {
					if (turn == 1) {
						scores.add(minimax(calculateNewState(board, i + " " + j, 1), 2));
						moves.add(i + " " + j);
					} else {
						scores.add(minimax(calculateNewState(board, i + " " + j, 2), 1));
						moves.add(i + " " + j);
					}

				}
			}
		}

		if (turn == 2) {
			int max = -30;
			for (int i = 0; i < scores.size(); i++) {
				if (scores.get(i) >= max) {
					max = scores.get(i);
				}
			}
			choice = moves.get(scores.indexOf(max));
			return max;

		} else {
			int min = 1000;
			for (int i = 0; i < scores.size(); i++) {
				if (scores.get(i) <= min) {
					min = scores.get(i);
				}
			}
			choice = moves.get(scores.indexOf(min));
			return min;
		}

	}

	public static int calculateScore(int board[][], int turn) {
		if (winStrategy(board, 1))
			return -10;
		else if (winStrategy(board, 2))
			return 10;
		else
			return 0;
	}

	public static boolean winStrategy(int board[][], int turn) {
		boolean rowwin = true;
		boolean columnwin = true;
		boolean diagnoalwin = true;
		for (int i = 0; i < 3; i++) {
			rowwin = true;
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != turn) {
					rowwin = false;
				}

			}
			if (!rowwin) {
				columnwin = true;
				for (int j = 0; j < 3; j++) {
					if (board[j][i] != turn) {
						columnwin = false;
					}

				}
			}

			if (columnwin || rowwin) {
				break;
			}
		}
		if (!rowwin && !columnwin) {
			for (int i = 0; i < 3; i++) {
				if (board[i][i] != turn) {
					diagnoalwin = false;
				}
			}
			if (!diagnoalwin) {
				diagnoalwin = true;
				for (int i = 0; i < 3; i++) {
					if (board[i][2 - i] != turn) {
						diagnoalwin = false;
					}
				}
			}
		}

		return columnwin || rowwin || diagnoalwin;
	}

	public static int[][] calculateNewState(int board[][], String move, int player) {
		int copyArray[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				copyArray[i][j] = board[i][j];
			}
		}
		copyArray[Integer.parseInt(move.split(" ")[0])][Integer.parseInt(move.split(" ")[1])] = player;
		return copyArray;
	}

	public static boolean checkGameOver(int board[][]) {
		if (!winStrategy(board, 1) && !winStrategy(board, 2)) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == 0)
						return false;

				}
			}
		}
		return true;
	}

}
