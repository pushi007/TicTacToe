package com.practice.onlineQuiz;

public class DuplicateList {
	private String name;
	private String age;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object arg0) {
		if ((this.getName().equals(((DuplicateList)(arg0)).getName())) && ((this.getAge().equals("OLD") && ((DuplicateList)(arg0)).getAge().equals("YOUNG"))
				|| (this.getAge().equals("YOUNG") && ((DuplicateList)(arg0)).getAge().equals("OLD")))) {
			return true;
		} else
			return false;

	}

	@Override
	public int hashCode() {
		return 0;
	}

}
