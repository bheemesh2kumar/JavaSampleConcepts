package com.demo.programmes;

import java.util.Arrays;

public class SelectionSort {
	
	public static void getselectionsort(int[] arrys)
	{
		
		//321
		//8,9,1,4,7
		
		int temp=0;
		
		for(int i=0;i<arrys.length;i++)
		{
			int min=i;
			
			for(int j=i+1;j<arrys.length;j++)
			{
				if(arrys[j]<arrys[min])
				{
					min=j;
				}
			}
			
			
			temp=arrys[i];
			arrys[i]=arrys[min];
			arrys[min]=temp;
			
			
		
		}
		
		System.out.println(Arrays.toString(arrys));
		
	}
	

	public static void main(String[] args) {
		
		int arry[]= {8,9,1,4,7};
		System.out.println(Arrays.toString(arry));
		getselectionsort(arry);
		
		

	}

}
