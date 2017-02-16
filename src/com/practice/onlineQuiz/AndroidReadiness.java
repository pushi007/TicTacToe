package com.practice.onlineQuiz;


import java.util.*;
import java.io.*;

public class AndroidReadiness {
	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 0;
		int numTestCases = 0;
		List<Human> people = new ArrayList<Human>();
		while ((line = stdin.readLine()) != null && line.length() != 0) {
			Superhero superHero = null;
			Human human = null;
			if (i == 0) {
				numTestCases = Integer.parseInt(line);
			} else {
				String[] input = line.split(" ");
				if (input[0].equals("SuperHero")) {
					superHero = new Superhero(input[1], Integer.parseInt(input[2]), input[3]);
					people.add(superHero);
				} else {
					human = new Human(input[1], Integer.parseInt(input[2]));
					people.add(human);
				}

			}

			i++;
		}
		if (numTestCases == (i - 1)) {
			for (Human Peop : people) {
				System.out.println(Peop.introduce());
			}
			Collections.sort(people);
			for (Human peoples : people) {
				System.out.println(peoples.getAge());
			}
		} else {
			System.out.println("Invalid input, please enter again");
		}

	}
}

class Human implements Comparable<Human> {
	protected int age;
	protected String name;

	public Human(String givenName, int age) {
		this.name = givenName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String introduce() {
		return "Hey! I'm " + name + " and I'm " + age + " years old.";
	}

	@Override
	public int compareTo(Human arg0) {
		int compareAge = ((Human) arg0).getAge();

		return this.age - compareAge;
	}
}

class Superhero extends Human {
	private String alterEgo;

	public Superhero(String givenName, int age, String alterEgo) {
		super(givenName, age);
		this.alterEgo = alterEgo;
	}

	public String getAlterEgo() {
		return alterEgo;
	}

	public String introduce() {
		return "Hey! I'm " + name + " and I'm " + age + " years old." + " I'm also known as " + alterEgo + "!";
	}
}
