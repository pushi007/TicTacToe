package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Accolite1 {

	public static void main(String[] args) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 0;		
		List<Long> A = new ArrayList<>();
		List<Long> B = new ArrayList<>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			if (count == 1) {
				String[] in = line.split(" ");
				for (String s : in) {
					A.add(Long.parseLong(s));
				}
			}
			if (count == 2) {
				String[] in = line.split(" ");
				for (String s : in) {
					B.add(Long.parseLong(s));
				}
			}
			count++;
		}

		Collections.sort(A);
		Collections.sort(B);
		long sumMonk = 0;
		long sumNotMonk = 0;

		for (long a : A) {
			
			long f = fx(a, B);
			long g = B.size()-f;
			if (g > 0) {
				sumMonk = sumMonk + f * g;
			} else {
				break;
			}

		}
		for (long b : B) {
			
			long f = fx(b, A);
			long g = A.size()-f;
			if (g > 0) {
				sumNotMonk = sumNotMonk + f * g;
			} else {
				break;
			}

		}

		if (sumMonk > sumNotMonk) {
			System.out.println("Monk " + (sumMonk - sumNotMonk));
		} else if (sumMonk < sumNotMonk) {
			System.out.println("!Monk " + (sumNotMonk - sumMonk));
		} else {
			System.out.println("Tie");
		}

	}

	public static long fx(long a, List<Long> B) {
		int count = 0;
//		List<Long> temp = new ArrayList<>();
//		temp.addAll(B);
		for (long b : B) {
			if (b < a)
				count++;
			else
				break;
		}

		return count;
	}

//	public static long gx(long a, List<Long> B) {
//		int count = 0;
//		List<Long> temp = new ArrayList<>();
//		temp.addAll(B);
//		Collections.reverse(temp);
//		for (long b : temp) {
//			if (b > a)
//				count++;
//			else
//				break;
//		}
//
//		return count;
//	}

}
