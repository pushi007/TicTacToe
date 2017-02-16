package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AmazonPractice {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		char[] input = null;
		int questions = 0;
		List<String> result = new ArrayList<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count == 1) {
				questions = Integer.parseInt(line);
			} else if (count == 0) {
				input = line.toCharArray();
			} else {
				String[] in = line.split(" ");
				int left = Integer.parseInt(in[0]);
				int right = Integer.parseInt(in[1]);
				double num = 0;
				for (int i = (left - 1); i < right; i++) {
					double power = Math.pow(10, (right - (i + 1)));
					double element = Double.parseDouble(Character.toString(input[i]));
					num = num + (element * power);
				}
				if (num % 7 == 0) {
					result.add("YES");
				} else {

					result.add("NO");
				}
			}

			count++;
		}

		for (String res : result) {

			System.out.println(res);
		}

	}

}
