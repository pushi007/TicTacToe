package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class AmazoneEasy {
	public static void main(String[] arg) throws Exception {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		Set<String> noDupes = new HashSet<>();
		while ((line = br.readLine()) != null && line.length() > 0) {
			if (count > 0) {
				noDupes.add(line);
				int l = line.length();
				char[] arr = line.toCharArray();
				for (int i = 0; i < l; i++) {
				
				}
			}
			count++;
		}
	}
}
