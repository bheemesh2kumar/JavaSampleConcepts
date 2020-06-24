package com.demo.programmes;

import java.util.Arrays;

public class FirstMaxsecond {
	// 23455

	public static void secondmaxnumber(int[] arry) {
		int temp;

		for (int i = 0; i < arry.length; i++) {
			for (int j = i + 1; j < arry.length; j++) {
				if (arry[j] > arry[i]) {
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}

			if (i == 2) {
				break;
			}

		}

		System.out.println("second max number is " + arry[1]);

	}

	public static void main(String[] args)

	{

		int arryval[] = { 6, 3, 9, 2, 7, 5, 4 };

		System.out.println("given arry is " + Arrays.toString(arryval));
		secondmaxnumber(arryval);

	}

}
