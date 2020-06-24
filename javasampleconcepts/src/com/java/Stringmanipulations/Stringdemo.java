package com.java.Stringmanipulations;

public class Stringdemo {

	public static void main(String[] args) {

		String str = "Hello How are Hyou";

		System.out.println(str.length());

		System.out.println(str.charAt(3));
		System.out.println("3rd occurece of H" + " " + str.indexOf('H', str.indexOf('H', str.indexOf('H') + 1)+1));

		System.out.println(str.indexOf('H'));
	}

}
