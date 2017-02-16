package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//To check if a graph is connected after removing a vertex from it.
public class SabreChallenge {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count = 0;
		// Number of vertices in the graph
		int N = 0;
		// number of edges in the graph
		int edges = 0;
		// remove vertex
		String removedVertex;
		Map<String, Integer> map = new HashMap<>();
		while ((line = br.readLine()) != null && line.length() > 0) {
			if (count == 0) {
				N = Integer.parseInt(line);

			} else if (count == 1) {
				edges = Integer.parseInt(line);

			} else if (count > 1 && count > (edges + 1)) {
				removedVertex = line;
				Set<String> set = new HashSet<>(map.keySet());
				for (String s : set) {
					if (s.contains(removedVertex)) {
						map.remove(s);
					}
				}
			} else {
				String[] a = line.split(" ");
				map.put(a[0] + "-" + a[1], 1);
			}
			count++;
		}

		if (map.size() == (N - 2)) {
			System.out.println("Connected");
		} else {
			System.out.println("Not Connected");
		}

	}

}
