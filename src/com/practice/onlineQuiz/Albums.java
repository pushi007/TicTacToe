package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Albums {
	long l = 0;
	long r = 0;
	long k = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count = 0;

		while ((line = br.readLine()) != null && line.length() != 0) {
			if (count > 2) {
				Albums al = new Albums();
				String[] in = line.split(" ");
				al.l = Long.parseLong(in[0]);
				al.r = Long.parseLong(in[1]);
				al.k = Long.parseLong(in[2]);
				System.out.println((int) ((al.r - al.l) / al.k));
			}
			count++;
		}

	}

}
