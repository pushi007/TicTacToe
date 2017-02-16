package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.crypto.CipherInputStream;

@SuppressWarnings("unused")
public class BennyCity {

	public static void main(String[] args) throws IOException {
		Comparator<Integer> compare = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1 - o2;
			}
		};

		SortedMap<String, Integer> cityBeauty = new TreeMap<String, Integer>();
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int N = 0;
		int M = 0;
		int C = 0;
		int lineCount = 0;
		while ((line = stdIn.readLine()) != null && line.length() != 0) {
			if (lineCount == 0) {
				String[] input = line.split(" ");
				N = Integer.parseInt(input[0]);
				M = Integer.parseInt(input[1]);
				C = Integer.parseInt(input[2]);
			}
			if (lineCount > 0 && lineCount <= N) {
				String[] input = line.split(" ");
				int sum = 0;

				for (int i = 0; i < input.length; i++) {
					sum = sum + Integer.parseInt(input[i]);
				}
				cityBeauty.put(line, sum);
			}
			lineCount++;
		}
		//cityBeauty.computeIfPresent(key, remappingFunction);
		System.out.println(cityBeauty);

	}

}
