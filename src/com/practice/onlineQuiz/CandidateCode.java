package com.practice.onlineQuiz;

import java.io.*;
import java.util.ArrayList;

public class CandidateCode {

	public static int[] GetBrightnessValue(int input1, String input2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		String[] input = input2.split("\\),\\(");
		for (int i = 0; i < input.length; i++) {
			int numberOfPearls = 0;
			ArrayList<Integer> pearlsBrigthness = new ArrayList<Integer>();
			float totalBrightness = 0;

			if (i != 0) {
				numberOfPearls = Integer.parseInt(input[i].split(",\\{")[0]);
				float temp = 0;
				for (String peralsFactor : input[i].split(",\\{")[1].split("\\}\\)")[0].split(",")) {

					pearlsBrigthness.add(Integer.parseInt(peralsFactor));
					temp = (float) (temp + Integer.parseInt(peralsFactor));
				}
				totalBrightness = (float) temp / numberOfPearls;
				int m = 0;
				int n = 0;
				float difference = (float) 0.1 * numberOfPearls;
				if (difference > 3) {
					m = (int) (numberOfPearls + difference) / 2;
					n = numberOfPearls - m;

				} else {
					m = (int) (numberOfPearls + 3) / 2;
					n = numberOfPearls - m;
					System.out.println("m" + m);
					System.out.println("n" + n);

				}
				int arraym[] = new int[m];
				int arrayn[] = new int[numberOfPearls - n];
				for (int j = 0; j < m; j++) {
					arraym[j] = (int) ((j + 1) * totalBrightness);
//					 result.add(arraym[j]);
				}
				for (int j = 0; j < numberOfPearls - n; j++) {
					int temp1 = n;
					arrayn[j] = (int) ((n + j) * totalBrightness);
					 result.add(arrayn[j]);
				}
				int min = (int) temp;
				System.out.println("min" + min);
				for (int k = 0; k < arraym.length; k++) {
					for (int l = 0; l < arrayn.length; l++) {
						if (Math.abs(arraym[k] - arrayn[l]) != 0 && Math.abs(arraym[k] - arrayn[l]) <= min) {
							min = Math.abs(arraym[k] - arrayn[l]);
						}

					}
					System.out.println("min" + min);
				}
				for (int k = 0; k < arraym.length; k++) {
					System.out.println("min in end loop" + min);
					for (int l = 0; l < arrayn.length; l++) {

						if (arraym[k] + arrayn[l] == temp && (Math.abs(arraym[k] - arrayn[l]) <= min)) {

							result.add(arraym[k] >= arrayn[l] ? arraym[k]
									: arrayn[l]);

						}
					}
				}
			} else {
				float temp = 0;
				numberOfPearls = Integer.parseInt((input[i].split(",\\{")[0]).substring(1, 2));
				for (String peralsFactor : input[i].split(",\\{")[1].split("\\}")[0].split(",")) {
					pearlsBrigthness.add(Integer.parseInt(peralsFactor));
					temp = (float) (temp + Integer.parseInt(peralsFactor));
				}

				totalBrightness = (float) temp / numberOfPearls;
			}
			System.out.println(numberOfPearls);
			System.out.println(pearlsBrigthness);
			System.out.println(totalBrightness);
		}
		for (Integer finalRes : result) {
			System.out.println(finalRes);
		}
		return null;
	}
}
