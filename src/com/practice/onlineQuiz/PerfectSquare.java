package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PerfectSquare {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i != 0) {
				numbers.add(Integer.parseInt(line));
			}
			i++;

		}
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println(numbers);
		for (Integer t : numbers) {
			Integer val = map.get(t);
			map.put(t, val == null ? 1 : val + 1);
		}
		Entry<Integer, Integer> max = null;

		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue())
				max = e;
		}

		int mostOccured = max.getKey();
		int count = 0;
		for (Integer countaMaxOccur : numbers) {
			if (mostOccured == countaMaxOccur)
				count++;
		}
		System.out.println(count);
		System.out.println(numbers.size());
		System.out.println(
				Double.valueOf(new DecimalFormat("#.000000").format((double) ((float) count / (float) numbers.size())
						* ((float) (count - 1) / (float) (numbers.size() - 1)))));

	}

}
