package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String first, last;
	private int id;
	private double balance;
	
	public Student(String first, String last, int id) {
		this.first = first;
		this.last = last;
		this.id = id;
	}

	private String getFirst() {
		return first;
	}

	/**
	 * Returns a string of last name of the student
	 * @return the last name of the student
	 */
	private String getLast() {
		return last;
	}

	/**
	 * Returns a string of full name of the student
	 * @return the first name added to the last name of the student
	 */
	public String getFullName() {
		return first + " " + last;
	}

	public int getId() {
		return id;
	}

	public void depositBearBucks(double amount) {
		balance += amount;
	}

	public double getBearBucksBalance() {
		return balance;
	}
}
