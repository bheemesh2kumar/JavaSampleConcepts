package com.demo.programmes;

public class Stringtest {

	public static void main(String[] args) {
		
		
		String str="adgbcg&%3uh7/}";
		
		
		if(str.matches(".*[\\[\\].:{}].*"))
		{
			System.out.println("true");
		}
		

	}

}
