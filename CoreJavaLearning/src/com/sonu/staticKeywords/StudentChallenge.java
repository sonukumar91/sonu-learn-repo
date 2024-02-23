package com.sonu.staticKeywords;

import java.time.LocalDate;

class Student
{
	private String rollNo;
	private static int count = 1;
	
	public Student() {
		this.rollNo = genertaeRollNo();
	}

	private String genertaeRollNo() {
		LocalDate d = LocalDate.now();
		String roll = "UNIV-"+d.getYear()+"-"+count;
		count++;
		return roll;
	}
	public void display() {
		System.out.println(rollNo);
	}
}

public class StudentChallenge {

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student();
		s2.display();

	}

}
