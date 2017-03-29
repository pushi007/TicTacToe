package com.practice.onlineQuiz;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("1221"));
	}

	public static String checkPalindrome(String input) {
		int i = 0;
		int j = input.length() - 1;
		while (i != j && i < j) {
			if (input.charAt(i) != input.charAt(j)) {
				return "Not a Palindrome";
			}
			i++;
			j--;
		}
		return "Palindrome";
	}
}
