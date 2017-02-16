package com.practice.onlineQuiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * This is the file with your answer, do not rename or move it.
 * Write your code in it, and save it before submitting your answer.
 */

/*
* Write the code for your answer in this class.
*/
public class Answer {
	/**
	 * Returns an array of IP addresses that are deemed suspicious.
	 *
	 * This method declaration must be kept unmodified.
	 *
	 * @param logPath
	 *            The full path of a log file. * This is the file with your
	 *            answer, do not rename or move it.
	 * @return An array of IP addresses.
	 */
	public static String[] findSuspiciousIps(String logPath) {
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(logPath));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		return new String[] { "Not implemented" };
	}

	/**
	 * Tests the method abbreviate with the examples given in the question. This
	 * test code is provided only for your convenience.
	 */
	public static void main(String[] args) {
		System.out.println("example.log:");
		for (String ip : findSuspiciousIps("example.log")) {
			System.out.println(ip);
		}
		System.out.println("bank_logs.log:");
		for (String ip : findSuspiciousIps("bank_logs.log")) {
			System.out.println(ip);
		}
	}
}