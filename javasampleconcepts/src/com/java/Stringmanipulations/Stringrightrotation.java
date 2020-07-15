package com.java.Stringmanipulations;

public class Stringrightrotation {

	public static String rightrotate(String str, int n) {

		char[] charinputarry = str.toCharArray();

		for (int i = 0; i < n; i++) {

			char lastchar = charinputarry[charinputarry.length - 1];

			for (int j = charinputarry.length - 1; j > 0; j--) {
				charinputarry[j] = charinputarry[j - 1];
			}

			charinputarry[0] = lastchar;

		}

		return String.valueOf(charinputarry);

	}

	public static void main(String[] args) {
		
		
		String str="Apple";
		
		String resutstr=rightrotate(str,2);
		
		System.out.println(resutstr);
		

	}

}
