package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SumofTwoNums {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String line;
		int i = 0;
		ArrayList<Double> sumList = new ArrayList<Double>();
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		while ((line = stdIn.readLine()) != null && line.length() != 0) {
			if (i == 0) {
				i = Integer.parseInt(line);
			} else {
				String[] input = line.split(" ");
				sumList.add(Double.parseDouble(input[0]) + Double.parseDouble(input[1]));

			}

		}

		for (double d : sumList) {
			System.out.println(String.format("%d", (long) d));
		}

	}

}
