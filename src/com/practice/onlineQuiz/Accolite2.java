package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Accolite2 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		List<Integer> result = new ArrayList<>();
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				long in = Long.parseLong(line.trim());
				if (in < 3) {
					result.add(0);
				} else if (in == 3) {
					result.add(6);
				} else if (in == 4) {
					result.add(36);
				} else {
					double temp = Math.pow(in, (in - 3));
					double temp2 = (temp * 6) % (1000000007);
					result.add((int) temp2);
				}
			}
			count++;
		}
		for (int re : result) {
			System.out.println(re);
		}

	}

}
