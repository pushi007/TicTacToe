package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EnableMyTeam1 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		List<Integer> result = new ArrayList<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {

				result.add(divideAndConquer(line.toCharArray()));

				// char[] input = line.toCharArray();
				// char[] halfArray = new char[input.length / 2];
				//
				// int j = 0;
				// boolean checked = false;
				// int min = input.length * 2;
				// if (input.length % 2 == 0) {
				// for (int i = input.length - 1; i > (input.length / 2) + 1;
				// i--) {
				// halfArray[j] = input[i];
				//
				// for (int k = 0; k < input.length / 2; k++) {
				// if (halfArray[j] == input[k]) {
				// if ((j + k) < min)
				// min = j + k;
				// checked = true;
				// break;
				// }
				// }
				// j++;
				// }
				// if (checked)
				// result.add(min);
				//
				// } else {
				// for (int i = input.length - 1; i > input.length / 2; i--) {
				// halfArray[j] = input[i];
				// for (int k = 0; k <= input.length / 2; k++) {
				// if (halfArray[j] == input[k]) {
				// if ((j + k) < min)
				// min = j + k;
				// checked = true;
				// break;
				// }
				// }
				// j++;
				// }
				// if (checked)
				// result.add(min);
				//
				// }
				// if (!checked) {
				// result.add(-1);
				// }
				//
			}
			count++;
		}
		for (int res : result) {
			System.out.println(res);
		}
	}

	public static int divideAndConquer(char[] arr) {
		char[] input = new char[arr.length / 2];
		char[] halfArray;
		for (int k = 0; k < input.length; k++) {
			input[k] = arr[k];
		}
		int j = 0;
		boolean checked = false;
		int min = arr.length * 2;

		if (arr.length < 2) {
			return -1;
		}

		if (arr.length % 2 == 0) {
			halfArray = new char[arr.length / 2];
			for (int i = arr.length - 1; i > (arr.length / 2) - 1; i--) {
				halfArray[j] = arr[i];

				for (int k = 0; k < input.length; k++) {
					if (halfArray[j] == input[k]) {
						if ((j + k) < min)
							min = j + k;
						checked = true;
						break;
					}
				}
				j++;
			}
			if (checked)
				return (min);

		} else {
			halfArray = new char[(arr.length / 2) + 1];
			for (int i = arr.length - 1; i >= arr.length / 2; i--) {
				halfArray[j] = arr[i];
				for (int k = 0; k < input.length; k++) {
					if (halfArray[j] == input[k]) {
						if ((j + k) < min)
							min = j + k;
						checked = true;
						break;
					}
				}
				j++;
			}
			if (checked)
				return min;

		}
		if (!checked) {
			return Math.min(input.length + divideAndConquer(halfArray), halfArray.length + divideAndConquer(input));
		}

		return -1;
	}

}
