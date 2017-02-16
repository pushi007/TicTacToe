package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MilyAndPens {

	public static void main(String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int i = 0;
		int n = 0;
		int p = 0;
		int m = 0;
		int counter = 0;
		Set<Integer> set = null;
		ArrayList<String> result = new ArrayList<String>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i != 0) {
				String[] input = line.split(" ");
				if (input.length == 3) {
					n = Integer.parseInt(input[0]);
					p = Integer.parseInt(input[1]);
					m = Integer.parseInt(input[2]);
					set = new HashSet<Integer>();
					counter += 3;
				}
				if (input.length == p || input.length == m) {
					if (input.length == p) {
						for (int j = 0; j < p; j++) {
							if(Integer.parseInt(input[j])<=n)
							set.add(Integer.parseInt(input[j]));
						}
					}
					if (input.length == m) {
						for (int j = 0; j < m; j++) {
							if(Integer.parseInt(input[j])<=n)
							set.add(Integer.parseInt(input[j]));
						}
					}

					if (counter == i) {
						if (set.size() == n && n > 1) {
							result.add("They can");
						} else {
							result.add("They can't");
						}

					}

				}
			}

			i++;
		}
		for (String res : result) {
			System.out.println(res);
		}
	}

}
