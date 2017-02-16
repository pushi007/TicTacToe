package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ViaComChallenge {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count = 0;
		char[] input = null;
		while ((line = br.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				String[] in = line.split(" ");
				
			} else {
				input = new char[Integer.parseInt(line)];
			}
			count++;
		}

	}

}
