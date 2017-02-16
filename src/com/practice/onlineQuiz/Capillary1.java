package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Capillary1 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;

		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				String s[] = line.split(" ");
				long sum = 0;
				for (long i = Long.parseLong(s[0]); i <= Long.parseLong(s[1]); i++) {
					sum = sum + calculatFk(i);
				}
				System.out.println(sum);
			}
			count++;
		}
	}

	public static long calculatFk(long number) {
		long temp = number;
		long temp2 = number;
		int loop = 0;
		while (temp % 10 > 0) {
			temp = temp / 10;
			temp2 = temp2 / 10;
			temp2 = (long) (temp2 + 2 * Math.pow(10, loop));
			loop++;
		}
		if (temp2 >= number) {
			return temp2;

		} else {
			temp = temp2;
			long temp3 = temp2;
			int loop2 = 0;
			while (temp % 10 > 0) {
				temp = temp / 10;
				temp3 = temp3 / 10;
				temp3 = (long) (temp3 + 5 * Math.pow(10, loop2));
				loop2++;
				if (temp3 >= number) {
					return temp3;
				}
			}
			if (temp3 >= number) {
				return temp3;
			} else {
				return (long) (temp2 + 2 * Math.pow(10, loop2));
			}
		}

	}

}
