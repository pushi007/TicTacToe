package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MonkAndTime {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		int n = 0;
		int result = 0;
		// int[] callingOrder = new int[100];
		// int[] idealOrder = new int[100];

		ArrayList<Integer> callingOrder = new ArrayList<Integer>();
		ArrayList<Integer> idealOrder = new ArrayList<Integer>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i == 0) {
				n = Integer.parseInt(line);
			} else {
				String[] input = line.split(" ");

				for (int j = 0; j < n; j++) {
					if (i == 1)
						callingOrder.add(Integer.parseInt(input[j]));
					else {
						idealOrder.add(Integer.parseInt(input[j]));
					}
				}

			}
			i++;
		}
		while (callingOrder.size() != 0) {
			if (callingOrder.get(0) == idealOrder.get(0)) {
				callingOrder.remove(0);
				idealOrder.remove(0);
//				System.out.println(callingOrder + "   " + idealOrder);
				result++;
			} else {
				int temp = callingOrder.get(0);
				callingOrder.remove(0);
				callingOrder.add(temp);
				// System.out.println(callingOrder + " " + idealOrder);
				result++;
			}
		}
		System.out.println(result);

	}

}
