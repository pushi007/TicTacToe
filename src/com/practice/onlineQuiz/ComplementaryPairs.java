package com.practice.onlineQuiz;

import java.util.ArrayList;
import java.util.List;

public class ComplementaryPairs {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 1, 5 };
		System.out.println(findKComplementryPairs(arr, 3));

	}

	public static List<String> findKComplementryPairs(int arr[], int k) {
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (k == arr[i] + arr[j]) {

					result.add("(" + i + ", " + j + ")");
					if (i != j)
						result.add("(" + j + ", " + i + ")");
				}
			}
		}

		return result;
	}

}
