package com.java.Stringmanipulations;

public class Stringreverse {

	public static String getstringrevrese(String str) {

		String strinputarry[] = str.split(" ");
		
		int arry[]= {2,3,4,5};
		
		

		String strresult = "";

		for (int i = strinputarry.length - 1; i >= 0; i--) {
			strresult = strresult + " " + strinputarry[i];
		}

		return strresult;
	}

	public static void main(String[] args) {

		String strval = "Hello how are you";
		System.out.println(strval);
		String reve = getstringrevrese(strval);

		System.out.println(reve);

	}

}
