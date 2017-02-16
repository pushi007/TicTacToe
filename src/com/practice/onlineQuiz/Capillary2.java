package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Capillary2 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		String input = "";
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count == 1) {
				input = line;
			} else if (count > 1) {
				String s[] = line.split(" ");
				int delete = 0;
				int min = input.length();
				Map<Character, Integer> map = new HashMap<>();
				for (int i = Integer.parseInt(s[0]) - 1; i < Integer.parseInt(s[1]); i++) {
					char c = input.charAt(i);
					if (!map.containsKey(c)) {
						map.put(c, 1);
					} else {
						map.put(c, map.get(c) + 1);
					}
				}

				for (Entry<Character, Integer> entry : map.entrySet()) {
					min = Math.min(min, entry.getValue());
				}
				int minimumCount = 0;
				for (char c : map.keySet()) {
					if (map.get(c) - min == 0) {
						minimumCount = minimumCount + min;
					}
					delete = delete + (map.get(c) - min);
				}
				if (minimumCount < delete) {
					System.out.println(minimumCount);
				} else {
					System.out.println(delete);
				}

			}

			count++;
		}
	}

}
