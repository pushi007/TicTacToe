package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AccoliteChallange {
	public static void main(String[] s) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		String playerTurn = null;
		int numOfTestCases = 0;
		ArrayList<Integer> devuSeq = new ArrayList<Integer>();
		ArrayList<Integer> charuSeq = new ArrayList<Integer>();
		ArrayList<String> result = new ArrayList<String>();
		int totalCases = 0;
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i != 0) {

				if (i == (2 + 4 * totalCases)) {
					String[] input = line.split(" ");

					for (int j = 0; j < input.length; j++) {
						devuSeq.add(Integer.parseInt(input[j]));
					}

				}
				if (i == (3 + 4 * totalCases)) {
					String[] input = line.split(" ");

					for (int j = 0; j < input.length; j++) {
						charuSeq.add(Integer.parseInt(input[j]));

					}
				}
				if (i == (4 + 4 * totalCases)) {
					if (line.equals("Devu")) {
						int count = 0;
						if (!devuSeq.equals(charuSeq)) {
							for (int j = 0; j < devuSeq.size(); j++) {
								if (devuSeq.get(j) != charuSeq.get(j))
									count++;
							}
							if (count > 2) {
								result.add("Churu");
							} else {
								result.add("Devu");
							}
						}
					} else {

						result.add("Churu");

					}
				}
				if (i % 4 == 0) {
					totalCases++;
					devuSeq.clear();
					charuSeq.clear();
				}
			} else {
				numOfTestCases = Integer.parseInt(line);
			}
			i++;
		}
		for (String winner : result) {
			System.out.println(winner);
		}

	}

}
