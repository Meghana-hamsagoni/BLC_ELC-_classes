package com.Example;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentDetails("ABC", 101, 85.5);
		System.out.println(student.getStudentDetails());

	}
}