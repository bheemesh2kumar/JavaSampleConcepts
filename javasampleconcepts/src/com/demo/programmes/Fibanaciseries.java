package com.demo.programmes;

public class Fibanaciseries {

	public static void getfibanociseries(int num) {

		int first = 0;
		int second = 1;
		int sum;

		for (int i = 0; i < num; i++) {
			System.out.print(first + " ");
			sum = first + second;
			first = second;
			second = sum;

		}

	}

	public static void main(String[] args) {
		
		
		getfibanociseries(10);

	}

}
