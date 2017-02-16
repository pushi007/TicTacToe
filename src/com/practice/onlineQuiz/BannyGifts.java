package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class BannyGifts {

	public static void main(String[] args) throws IOException {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int fall = 0;
		Map<String, Integer> coveredPoints = new HashMap<String, Integer>();
		while ((line = stdIn.readLine()) != null && line.length() != 0) {

			int x = 0;
			int y = 0;

			String covered = x + "-" + y;

			coveredPoints.put(covered, 1);
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == 'R') {
					y = y + 1;
					covered = x + "-" + y;
					// System.out.println(covered);
					if (coveredPoints.get(covered) != null) {
						fall = fall + 1;
					} else {
						coveredPoints.put(covered, 1);
					}

				}
				if (line.charAt(i) == 'L') {
					y = y - 1;
					covered = x + "-" + y;
					// System.out.println(covered);
					if (coveredPoints.get(covered) != null) {
						fall = fall + 1;
					} else {
						coveredPoints.put(covered, 1);
					}

				}
				if (line.charAt(i) == 'U') {
					x = x - 1;
					covered = x + "-" + y;
					// System.out.println(covered);
					if (coveredPoints.get(covered) != null) {
						fall = fall + 1;
					} else {
						coveredPoints.put(covered, 1);
					}

				}
				if (line.charAt(i) == 'D') {
					x = x + 1;
					covered = x + "-" + y;
					// System.out.println(covered);
					if (coveredPoints.get(covered) != null) {
						fall = fall + 1;
					} else {
						coveredPoints.put(covered, 1);
					}

				}

			}
		}
		// System.out.println(coveredPoints);
		System.out.println(fall);

	}

}
