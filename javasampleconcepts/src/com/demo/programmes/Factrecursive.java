package com.demo.programmes;

public class Factrecursive {

	public static int fact(int n) {
		
		//54321

		if (n == 1) {
			return n;
		}

		int x = n * fact(n - 1);

		return x;

	}

	public static void main(String[] args) {

		System.out.println(fact(5));
		int i=10;
		
		System.out.println(i/5);

	}

}
