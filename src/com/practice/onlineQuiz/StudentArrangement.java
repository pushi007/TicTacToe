package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StudentArrangement {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		int M = 0;
		int N = 0;
		int K = 0;
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count == 0) {
				String input[] = line.split(" ");
				N = Integer.parseInt(input[0]);
				M = Integer.parseInt(input[1]);
				K = Integer.parseInt(input[2]);
				for (int i = 1; i <= M; i++) {
					map.put(i, 0);
				}

			} else {

				String input[] = line.split(" ");
				for (String s : input) {
					int key = Integer.parseInt(s);
					boolean flag = true;
					for (int i = key; i <= M; i++) {
						if (map.get(i) < K) {
							map.put(i, map.get(i) + 1);
							break;
						} else if (flag) {
							flag = false;
							result++;

						}
						if (i == M) {
							if (map.get(1) < K) {
								map.put(1, map.get(i) + 1);
								break;
							}
						}
					}

				}
			}
			count++;
		}

		System.out.println(result);
	}

}
