package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SmithNumbers {

	public static void main(String[] args) throws IOException {

		String line;
		ArrayList<Integer> smithListSize = new ArrayList<Integer>();
		int i = 0;
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		SortedSet<Integer> smithNumList = new ConcurrentSkipListSet<Integer>();
		ArrayList<Integer> coveredNonSmithNums = new ArrayList<>();
		while ((line = stdIn.readLine()) != null && line.length() != 0) {
			int counter = 0;

			if (i != 0) {
				String[] input = line.split(" ");
				for (int loop = Integer.parseInt(input[0]); loop <= Integer.parseInt(input[1]); loop++) {
					if (smithNumList.contains(loop)) {
						counter++;
					} else {
						if (isPrimeNumber(loop)) {
							smithNumList.add(loop);
							counter++;
						} else {
							if (isSmithNumber(loop)) {
								smithNumList.add(loop);
								counter++;
							}
						}

					}

				}
				smithListSize.add(counter);
			}
			i++;
		}

		for (Integer numOfSmithNumbers : smithListSize) {
			System.out.println(numOfSmithNumbers);
		}

	}

	public static boolean isSmithNumber(int smithNum) {
		int sumOfPrimeNumbersDigit = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer primeNum : getPrimeFactors(smithNum, list)) {
			if (primeNum / 10 == 0)
				sumOfPrimeNumbersDigit = sumOfPrimeNumbersDigit + primeNum;
			else {
				sumOfPrimeNumbersDigit = sumOfPrimeNumbersDigit + getSumofDigits(primeNum);
			}
		}
		if (getSumofDigits(smithNum) == sumOfPrimeNumbersDigit) {

			return true;
		}
		return false;
	}

	public static int getSumofDigits(int input) {
		if (input / 10 == 0)
			return input;
		else {
			return (input % 10) + getSumofDigits(input / 10);
		}

	}

	public static ArrayList<Integer> getPrimeFactors(int num, ArrayList<Integer> list) {
		for (int i = 2; i <= num / i; i++) {
			while (num % i == 0) {
				list.add(i);
				num = num / i;
			}

		}
		if (num > 1)
			list.add(num);
		return list;
	}

	public static boolean isPrimeNumber(int prime) {
		for (int j = 2; j <= prime / 2; j++) {
			if (prime % j == 0) {
				return false;
			}
		}
		return true;
	}

}
