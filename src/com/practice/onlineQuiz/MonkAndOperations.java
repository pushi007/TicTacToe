package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MonkAndOperations {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		int k = 0;
		int n = 0;
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i > 0 && i % 2 == 0) {
				String in[] = line.split(" ");
				List<Long> intList = new ArrayList<>();
				for (String input : in) {
					intList.add(Long.parseLong(input));
				}
				for (int j = 0; j < k; j++) {
					if (intList.get(0) > intList.get(intList.size() - 1)) {
						intList.remove(intList.size() - 1);
					} else {

						intList.remove(0);
					}

				}

				System.out.println(intList.get(0) * intList.get(intList.size() - 1));

			} else if (i % 2 != 0) {
				k = Integer.parseInt(line.split(" ")[1]);
				n = Integer.parseInt(line.split(" ")[0]);
			}
			i++;
		}

	}

}
