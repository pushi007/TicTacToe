package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BannyFriends2 {
	static HashMap<String, Integer> finalMap = new HashMap<String, Integer>();

	public static void main(String[] args) throws IOException {
		HashMap<String, Long> input = new HashMap<String, Long>();
		HashMap<String, Long> output = new HashMap<String, Long>();
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> frndPresent = new ArrayList<>();
		ArrayList<Long> finalresult = new ArrayList<>();
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int lineNum = 0;
		int city = 0;
		int paths = 0;
		while ((line = stdIn.readLine()) != null && line.length() != 0) {
			if (lineNum == 0) {
				city = Integer.parseInt(line.split(" ")[0]);
				for (int i = 1; i <= city; i++) {
					cities.add((Integer.toString(i)));
				}
				paths = Integer.parseInt(line.split(" ")[1]);

			}
			if (lineNum > 0 && lineNum <= paths) {
				String[] arr = line.split(" ");
				if (input.get(arr[0] + "-" + arr[1]) != null) {
					if (input.get(arr[0] + "-" + arr[1]) > Long.parseLong(arr[2])) {
						input.put(arr[0] + "-" + arr[1], Long.parseLong(arr[2]));
						input.put(arr[1] + "-" + arr[0], Long.parseLong(arr[2]));
					}
				} else {
					input.put(arr[0] + "-" + arr[1], Long.parseLong(arr[2]));
					input.put(arr[1] + "-" + arr[0], Long.parseLong(arr[2]));
				}

			}
			if (lineNum == paths + 1) {
				output = calPath(cities, input);
			}
			if (lineNum > paths + 1) {
				String[] c = line.split(" ");
				switch (c[0].charAt(0)) {
				case '+':
					frndPresent.add(c[1]);
					break;
				case '-':
					frndPresent.remove(c[1]);
					break;
				case '?':
					long res = 99999999999l;
					long temp = 0;

					for (String s : frndPresent) {
						if (s.equals(c[1])) {
							res = 0;
						} else {
							if (output.get(s + "-" + c[1]) != null) {
								if (output.get(c[1] + "-" + s) != null) {
									if (output.get(c[1] + "-" + s) < output.get(s + "-" + c[1]))
										temp = output.get(c[1] + "-" + s);
									else {
										temp = output.get(s + "-" + c[1]);
									}
								} else {
									temp = output.get(s + "-" + c[1]);
								}
							} else {
								temp = output.get(c[1] + "-" + s);
							}

							if (temp < res)
								res = temp;

						}

					}

					if (res == 99999999999l)
						finalresult.add((long) -1);
					else
						finalresult.add(res);
					break;
				}
			}
			lineNum++;
		}
		for (long resu : finalresult) {
			System.out.println(resu);
		}

	}

	public static HashMap<String, Long> calPath(ArrayList<String> cities, HashMap<String, Long> input) {
		HashMap<String, Long> tempMap = new HashMap<>();

		for (String s : cities) {
			HashSet<String> key = new HashSet<String>(input.keySet());
			for (String directPaths : key) {
				if (!directPaths.contains(s)) {

					String path = s + "-" + directPaths.substring(0, directPaths.indexOf('-'));
					String str1 = s + "-" + directPaths.substring(directPaths.lastIndexOf('-') + 1);
					String str2 = directPaths.substring(directPaths.lastIndexOf('-') + 1) + "-" + s;
					if (input.get(path) != null) {

						if (input.get(str1) == null) {
							if (input.get(str2) == null) {
								tempMap.put(str1, (input.get(directPaths) >= input.get(path) ? input.get(directPaths)
										: input.get(path)));
								tempMap.put(str2, (input.get(directPaths) >= input.get(path) ? input.get(directPaths)
										: input.get(path)));
							} else {
								if (input.get(directPaths) < input.get(str2) && input.get(path) < input.get(str2)) {
									tempMap.put(str1, (input.get(directPaths) >= input.get(path)
											? input.get(directPaths) : input.get(path)));
									tempMap.put(str2, (input.get(directPaths) >= input.get(path)
											? input.get(directPaths) : input.get(path)));

								}
							}
						} else {
							if (input.get(directPaths) < input.get(str1) && input.get(path) < input.get(str1)) {
								tempMap.put(str1, (input.get(directPaths) >= input.get(path) ? input.get(directPaths)
										: input.get(path)));
								tempMap.put(str2, (input.get(directPaths) >= input.get(path) ? input.get(directPaths)
										: input.get(path)));

							}
						}
					}

				}
				if (!tempMap.isEmpty())
					input.putAll(tempMap);
			}
		}

		return input;
	}

}
