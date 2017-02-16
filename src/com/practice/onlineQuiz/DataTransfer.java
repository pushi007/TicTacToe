package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataTransfer {

	public static void main(String[] args) throws Exception {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int denominator = 0;
		int sum = 0;

		while ((line = br.readLine()) != null && line.length() != 0) {
			if (i == 0) {
				int n = Integer.parseInt(line);
				denominator = n * (n - 1) / 2;
			} else {
				String[] s = line.split(" ");
				int count = 0;
				int c = 0;
				for (String in : s) {
					if (Integer.parseInt(in) == 0) {
						count++;
					} else {
						if (count > 1) {
							int partialNumerator = count * (count - 1) / 2;
							sum = sum + partialNumerator;

						}
						count = 0;
					}
					c++;
					if (c == s.length && count > 1) {
						int partialNumerator = count * (count - 1) / 2;
						sum = sum + partialNumerator;

					}

				}
			}
			i++;
		}
		boolean printed = false;
		if (sum != 0) {
			if (denominator % sum == 0) {
				System.out.println(1 + " " + denominator / sum);
				printed = true;
			}

			else {
				for (int j = sum-1; j <= 2; j--) {
					if (sum % j == 0 && denominator % j == 0) {
						System.out.println(sum / j + " " + denominator / j);
						printed = true;
						break;
					}
				}
			}
			if (!printed) {
				System.out.println(sum + " " + denominator);
			}
		} else {
			System.out.println(sum + " " + denominator);
		}
	}

}
