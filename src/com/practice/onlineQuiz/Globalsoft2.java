package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Globalsoft2 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;

		ArrayList<Long> input = new ArrayList<>();
		long n = 0, m = 0;
		long sum = 0;
		while ((line = stdin.readLine()) != null && line.length() != 0) {

			if (count == 0) {
				String in[] = line.split(" ");
				n = Long.parseLong(in[0]);
				m = Long.parseLong(in[1]);
			}
			if (count > 0 && count <= m) {
				input.add(Long.parseLong(line.split(" ")[2]));
			}

			if (count > m + 1) {
				String in[] = line.split(" ");
				for (String s : in) {
					input.add(Long.parseLong(s));
				}
			}
			count++;
		}

		Collections.sort(input);

		for (int k = 0; k < n - 1; k++) {
			sum = sum + input.get(k);
		}

		System.out.println(sum);

	}

}
