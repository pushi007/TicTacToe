package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LenskartHiring {

	public static void main(String[] args) throws Exception {
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int n = 0;
		ArrayList<Integer> indexOfPrimeStreets = new ArrayList<>();
		ArrayList<Integer> streets = new ArrayList<>();
		ArrayList<Integer> indexOfNonPrimeStreets = new ArrayList<>();
		while ((line = br.readLine()) != null && line.length() != 0) {
			if (count == 0) {
				n = Integer.parseInt(line);
			} else {
				String[] input = line.split(" ");
				for (int i = 0; i < n; i++) {
					int in = Integer.parseInt(input[i]);
					streets.add(in);
					boolean isPrime = true;
					for (int j = 2; j <= in / 2; j++) {
						if (in % j == 0) {
							isPrime = false;
							break;
						}
					}
					if (in == 1) {
						isPrime = false;
					}
					if (isPrime) {
						indexOfPrimeStreets.add(i);
					} else {
						indexOfNonPrimeStreets.add(i);
					}

				}

			}

			count++;
		}
		System.out.println(
				"index non priime list : " + indexOfNonPrimeStreets + "index of prime list " + indexOfPrimeStreets);
		ArrayList<Integer> res = new ArrayList<>();

		if (indexOfPrimeStreets.size() == 0) {
			for (int l = 0; l < n; l++) {
				System.out.print(-1 + " ");
			}
		} else if (indexOfNonPrimeStreets.size() == 0) {
			for (int result : streets) {
				System.out.print(result + " ");
			}
		} else {
			for (int j = 0; j < indexOfNonPrimeStreets.size(); j++) {
				int min = n;
				int index = 0;
				for (int k = 0; k < indexOfPrimeStreets.size(); k++) {
					int temp = Math.abs(indexOfNonPrimeStreets.get(j) - indexOfPrimeStreets.get(k));
					if (temp < min) {
						min = temp;
						index = indexOfPrimeStreets.get(k);
					}
				}
				res.add(j, streets.get(index));

			}
			for (int l = 0; l < indexOfPrimeStreets.size(); l++) {
				res.add(indexOfPrimeStreets.get(l), streets.get(indexOfPrimeStreets.get(l)));
			}

			for (int result : res) {
				System.out.print(result + " ");
			}
		}
	}

}
