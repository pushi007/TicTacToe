package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SapientHiring {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count = 0;
		List<Long> input = new ArrayList<>();
		List<Long> index = new ArrayList<>();
		Long N=(long) 0;
		while ((line = br.readLine()) != null && line.length() != 0) {
			if (count == 1) {
				String in[] = line.split(" ");
				for (String s : in) {
					input.add(Long.parseLong(s));
				}
			}
			if (count > 1) {
				String[] ind = line.split(" ");
				long l = Long.parseLong(ind[0]);
				long r = Long.parseLong(ind[1]);
				for (long i = (l - 1); i < r; i++) {
					index.add(i);
				}
			} else {
				N = Long.parseLong(line.split(" ")[0]);
			}
			count++;
		}

		Collections.sort(input);

		for (int j = 0; j < N; j++) {

		}

	}
}
