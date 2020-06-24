package com.java.ploymorphism;

public class Test {

	public static void main(String[] args) {

		Testoverload Testoverloadref = new Testoverload();

		Monkey Monkeyref = new Monkey();
		Testoverloadref.testmethod(Monkeyref);

		Person Personref = new Person();
		Testoverloadref.testmethod(Personref);

		Monkeyref = new Person();
		
		Testoverloadref.testmethod(Monkeyref);

	}

}
