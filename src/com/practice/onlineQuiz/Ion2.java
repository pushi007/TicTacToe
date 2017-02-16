package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ion2 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		List<Integer> result = new ArrayList<>();
		List<Long> A = new ArrayList<>();
		Map<Long, Long> inputSet = new HashMap<>();
		List<Integer> B = new ArrayList<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				String[] input = line.split(" ");

				for (String s : input) {
					long in = Long.parseLong(s);
					inputSet.put(Math.abs(in), in);
				}
			}

			count++;
		}
		A.addAll(inputSet.keySet());
		Collections.sort(A);

		for (long l : A) {

			System.out.print(inputSet.get(l) + " ");

		}

	}

}
