package com.demo.programmes;

import java.util.Arrays;

public class Bubblesortalgo {

	public static int[] getbubblesort(int array[]) 
	{
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}

		}
		
		return array;
	}

	public static void main(String[] args) {
		
		int array[]= {9,6,4,2,1,3};
		System.out.println(Arrays.toString(array));
		
		int result[]=getbubblesort(array);
		
		System.out.println(Arrays.toString(result));

	}

}
