package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmazingPrice {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		int n = 0;
		int p = 0;
		int[] height = null;
		int[] result = null;
		int index = 0;
		double res = 0;
		int resIndex = 0;
		double mod = 1e9 + 7;
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i != 0) {
				if (i % 2 == 0) {
					res = 0;
					index = 0;
					String[] input = line.split(" ");
					for (int j = 0; j < n; j++) {
						height[j] = Integer.parseInt(input[j]);
					}
					for (int k = 0; k < n; k++) {
						p = 0;

						for (int l = k + 1; l < n; l++) {
							if (height[k] <= height[l]) {
								p++;
								break;
							} else {
								p++;
							}
						}
						for (int m = k - 1; m >= 0; m--) {
							if (height[k] <= height[m]) {
								p++;
								break;
							} else {
								p++;
							}
						}
						double store = (((p % mod) * (k + 1)) % mod);
						if (store > res) {
							res = store;
							index = k + 1;
						}

						if (k == n - 1) {
							result[resIndex] = index;
							resIndex++;
						}
					}

				} else {
					n = Integer.parseInt(line.trim());
					height = new int[n];

				}
			} else {
				result = new int[Integer.parseInt(line.trim())];
			}
			i++;
		}
		for (int finalres : result) {
			if (finalres != 0)
				System.out.println(finalres);
			else
				System.out.println(1);
		}

	}

}
