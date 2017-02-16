package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Rangde2 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;

		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0 && count % 2 == 0) {
				long minimumThinking = 0;
				String s[] = line.split(" ");
				Set<Long> set = new HashSet<>();

				for (String in : s) {
					minimumThinking = minimumThinking + calcMinimumThinking(Long.parseLong(in), set);
				}

				System.out.println(minimumThinking);
			}
			count++;
		}
	}

	public static long calcMinimumThinking(long number, Set<Long> set) {

		if (!set.add(number)) {
			return 1 + calcMinimumThinking(number + 1, set);
		} else {
			return 0;
		}

	}

}
