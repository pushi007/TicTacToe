package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NovemberFredo {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count = 0;
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count > 0) {
				long n = Long.parseLong(line);
				if (n == 1)
					System.out.println(n);
				else
					System.out.println(2 * (n - calXForN(n)));
			}

			count++;
		}

	}

	public static long calXForN(long N) {
		long x = 0;
		for (long i = 1; i <= N; i++) {
			if (i * (i + 3) > 2 * N) {
				x = i - 1;
				break;
			}
		}
		return x;
	}

}
