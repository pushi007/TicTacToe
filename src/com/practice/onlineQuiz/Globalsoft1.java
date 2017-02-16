package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Globalsoft1 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;
		List<Integer> result = new ArrayList<>();
		
		while ((line = stdin.readLine()) != null && line.length() != 0) {

			if (count > 0) {
				String input[] = line.split(" ");
				List<Integer> returnedList = primeInteger(Integer.parseInt(input[0]));
				int divideCount = 0;
				List<Long> longLst = new ArrayList<>();
				for (int l : returnedList) {
					for (long k = Long.parseLong(input[1]); k <= Long.parseLong(input[2]); k++) {
						if (k % l == 0 && !longLst.contains(k)) {
							divideCount++;
							longLst.add(k);
						}
					}
				}
				result.add(divideCount);

			}
			count++;
		}
		for (int res : result) {
			System.out.println(res);
		}

	}

	public static List<Integer> primeInteger(int n) {
		List<Integer> listPrime = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				listPrime.add(i);
			}

		}
		return listPrime;
	}

}
