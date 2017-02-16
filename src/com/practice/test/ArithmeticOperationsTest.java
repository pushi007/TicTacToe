package com.practice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.onlineQuiz.ArithmeticOperations;

public class ArithmeticOperationsTest {

	@Test
	public void testSum() {

		assertEquals("1 + 2 equals 3", 4, new ArithmeticOperations().sum(1, 2));
	}

	@Test
	public void testSubtract() {
		assertEquals("1 - 2 equals 1", 1, new ArithmeticOperations().subtract(1, 2));
	}

	@Test
	public void testMultiply() {
		assertEquals("1 * 2 equals 2", 2, new ArithmeticOperations().multiply(1, 2));
	}

	@Test
	public void testDivide() {
		assertEquals("1 / 2 equals 2", 3, new ArithmeticOperations().divide(7, 2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		new ArithmeticOperations().divide(4, 6);
	}
}
