package com.java.singleton;

public class TestEmployee {

	public static void main(String[] args) {

		Employee Employee1 = new Employee(202, "Sivaram");

		Employee1.setGrade(4);
		Employee1.setSalary(50000);
		
		
		System.out.println("prignting values");

		System.out.println(Employee1.empid + " " + Employee1.empName + " " + Employee1.getSalary() + " " + Employee1.grade);

	}

}
