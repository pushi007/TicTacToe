/*
 * 
 * Write a program that prints the numbers in the given range. But for multiples of three print “Fizz” instead of the number and 
for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”. Print a new line after each string or number.

Input Format First line will be the number of testcases, T. Next line will have T integers, denoted by N.

Output Format For each testcase, print the number from 1 to N. But follow the rules given in the problem statement.

Constraints

1 <= T <= 10

N is an integer.
 * 
 */

package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeTest {
	public static void main(String args[]) throws Exception {

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int iteration = 0;
		int numOfTestCases = 0;
		while ((line = stdIn.readLine()) != null && line.length() != 0) {

			if (iteration == 0) {
				numOfTestCases = Integer.parseInt(line);

			} else {
				String[] input = line.split(" ");
				if (numOfTestCases == input.length) {
					for (int i = 0; i < input.length; i++) {
						for (int j = 1; j <= Integer.parseInt(input[i]); j++) {
							boolean flag = false;
							if (j % 3 == 0 && j % 5 == 0) {
								System.out.println("FizzBuzz");
								flag = true;
							} else {
								if (flag == false && j % 5 == 0) {
									System.out.println("Buzz");
									flag = true;
								} else {
									if (flag == false && j % 3 == 0) {
										System.out.println("Fizz");

									} else {
										System.out.println(j);
									}
								}
							}

						}
					}
				} else {
					System.out.println("Invalid input");
				}
			}
			iteration++;
		}

	}
	
	public void testInput() throws IOException{
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=stdIn.readLine())!=null&&line.length()!=0){
			
		}
	}
}
