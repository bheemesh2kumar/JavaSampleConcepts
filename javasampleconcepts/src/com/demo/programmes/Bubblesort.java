package com.demo.programmes;

import java.util.Arrays;

public class Bubblesort {

	public static void getbubblesort(int[] array)

	{
		//321
		//231
		//213
		
		//123
		int temp = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

	System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		
		int[] arrayval= {8,1,6,7,3,2};
		
		
		System.out.println(Arrays.toString(arrayval));
		getbubblesort(arrayval);
		

	}

}
