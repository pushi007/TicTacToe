package com.practice.test;

import org.junit.Test;

import com.practice.onlineQuiz.TicTacToe;

public class TicTactToeTest {

	int arr[][] = { { 1, 0, 2 }, { 2, 0, 0 }, { 2, 1, 1 } };

	@Test
	public void testMinimax() {
		System.out.println(new TicTacToe().minimax(arr, 2) + "choice : " + TicTacToe.choice);
	}

}
