package com.demo.programmes;

import java.util.Arrays;

public class minmaxofarray {

	public static void getminmaxnumbers(int arry[]) {
//123
		int max = arry[0];
		int min = arry[0];

		for (int i = 1; i < arry.length; i++) {
			if (arry[i] > max) {
				max = arry[i];
			}

			else if (arry[i] < min) {
				min = arry[i];
			}
		}

		System.out.println("max is " + max);
		System.out.println("min is " + min);
	}

	public static void main(String[] args) {

		int arryval[] = { 6, 3, 9, 2, 7, 5, 4 };

		System.out.println("given arry is " + Arrays.toString(arryval));
		getminmaxnumbers(arryval);

	}

}
