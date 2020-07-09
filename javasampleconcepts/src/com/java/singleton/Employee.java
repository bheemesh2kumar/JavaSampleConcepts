package com.java.singleton;

public class Employee

{
	int empid;
	String empName;
	int salary;

	int grade;
	String company = "IBM";

	public Employee(int empid, String empName) {
		this.empid = empid;
		this.empName = empName;

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
