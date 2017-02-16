package com.practice.onlineQuiz;

public class ArithmeticOperations {

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		if (a > b)
			return a / b;
		else
			throw new IllegalArgumentException("a should be greater than b");
	}
}
