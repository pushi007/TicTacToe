package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EnableMyTeam2 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		List<Integer> result = new ArrayList<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				long input = Long.parseLong(line);
				int countOfMatch = 0;
				for (int i = 1; i < input; i++) {
					if ((i ^ input) == i + input) {
						countOfMatch++;
					}
				}
				result.add(countOfMatch);
			}
			count++;
		}
		for (int res : result) {
			System.out.println(res);
		}
	}

}
