package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleJhoolAndWorldTour {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		long countries = 0;
		long ranges = 0;
		int testCases = 0;
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i != 0) {
				if (i == 1) {
					String[] input = line.split(" ");
					countries = Long.parseLong(input[0]);
					ranges = Long.parseLong(input[1]);
					testCases++;
				}
				if (i == (testCases + ranges + 1)) {
					String[] input = line.split(" ");
					countries = Long.parseLong(input[0]);
					ranges = Long.parseLong(input[1]);
					testCases++;
				} else {

				}
			}
			i++;
		}

	}

}
