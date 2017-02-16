package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class LovelyCouple {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		ArrayList<String> result = new ArrayList<String>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (i != 0) {
				LovelyCouple lovelyCouple = new LovelyCouple();

				String[] input = line.split(" ");

				ArrayList<Integer> b = new ArrayList<Integer>();

				lovelyCouple.getPrimeFactors(
						lovelyCouple.lcmFind(Integer.parseInt(input[0]), Integer.parseInt(input[1])), b);
				ArrayList<Integer> temp = new ArrayList<Integer>();

				for (int j = 0; j < b.size(); j++) {
					if (j <= temp.size()) {
						if (temp.contains(b.get(j)))
							temp.remove(b.get(j));
						else {
							temp.add(b.get(j));
						}
					} else {
						temp.add(b.get(j));
					}
				}
				System.out.println(temp);
				if (lovelyCouple.isPrimeNumber(temp.size()))
					result.add("Yes");
				else {
					result.add("No");
				}

			}

			i++;
		}
		for (String res : result) {
			System.out.println(res);
		}
	}

	public ArrayList<Integer> getPrimeFactors(int num, ArrayList<Integer> list) {
		if (isPrimeNumber(num)) {
			list.add(num);
		} else {
			for (int i = 2; i <= num && isPrimeNumber(i); i++) {
				if (num % i == 0 && num != i) {
					list.add(i);
					num = num / i;
					i = num + 1;
					getPrimeFactors(num, list);
				}
			}
		}
		return list;
	}

	public boolean isPrimeNumber(int prime) {
		if (prime == 1)
			return false;
		for (int j = 2; j <= prime; j++) {
			if (prime % j == 0 && prime != j) {
				return false;
			}
		}
		return true;
	}

	public int lcmFind(int num1, int num2) {
		int lcm = 1;
		for (int i = num1; i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}
}
