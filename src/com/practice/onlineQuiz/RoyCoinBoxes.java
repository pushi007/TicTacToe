package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class RoyCoinBoxes {
	public static void main(String[] s) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int boxes;
		int numOfDays = 0;
		int testCaseLine = 0;
		ArrayList<Integer> boxesWithCoins = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (testCaseLine == 0) {
				boxes = Integer.parseInt(line);
				for (int j = 0; j < boxes; j++) {
					boxesWithCoins.add(0);
				}

			}
			if (testCaseLine == 1)
				numOfDays = Integer.parseInt(line);
			if (testCaseLine >= 2 && testCaseLine <= (numOfDays + 1)) {
				String[] input = line.split(" ");
				for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {

					boxesWithCoins.set(i - 1, boxesWithCoins.get(i - 1) + 1);
				}

			}
			if (testCaseLine > (numOfDays + 2)) {
				int count = 0;
				for (Integer coins : boxesWithCoins) {
					if (coins >= Integer.parseInt(line)) {
						count++;
					}
				}
				result.add(count);
			}
			testCaseLine++;
		}
		for (Integer resultCount : result) {
			System.out.println(resultCount);
		}
	}
}
