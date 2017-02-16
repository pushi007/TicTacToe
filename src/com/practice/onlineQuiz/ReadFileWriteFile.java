package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileWriteFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/pushpendra/Desktop/firstFile.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
		writer.write("first time");

		writer.close();
		System.out.println("done");

		BufferedReader reaader = new BufferedReader(new FileReader(file.getAbsolutePath()));
		String line;
		while ((line = reaader.readLine()) != null) {
			System.out.println(line);
		}
		reaader.close();
		System.out.println("read completed");
	}

}
