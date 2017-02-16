package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rangde1 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;

		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				String s = printBinaryform(Long.parseLong(line));
				boolean flag = false;
				for (int i = s.length() - 1; i >= 0; i--) {
					if (s.charAt(i) == '0') {
						flag = true;
						s = s.substring(0, i) + "1" + s.substring(i + 1);
						break;
					}

				}
				if (!flag) {
					s = 1 + s;
				}
				// System.out.println(s);
				System.out.println(getDecimalFromBinary(Long.parseLong(s)));
			}
			count++;
		}
	}

	public static String printBinaryform(long number) {
		long remainder;

		if (number <= 1) {
			// System.out.print(number);
			return "" + number;
		}
		remainder = number % 2;
		return printBinaryform(number >> 1) + "" + remainder;
		// System.out.print(remainder);

	}

	public static long getDecimalFromBinary(long binary) {
		long decimal = 0;
		long power = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				long tmp = binary % 10;
				decimal += tmp * Math.pow(2, power);
				binary = binary / 10;
				power++;
			}
		}
		return decimal;
	}

}
