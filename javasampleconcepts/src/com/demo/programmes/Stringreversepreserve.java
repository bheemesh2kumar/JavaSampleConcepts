package com.demo.programmes;

import java.util.Arrays;

public class Stringreversepreserve {

	public static  char[] stringreverse(String str) {

		// Ab c

		char intputarray[] = str.toCharArray();
		char resultarray[] = new char[intputarray.length];

		for (int i = 0; i < intputarray.length; i++) {
			if (intputarray[i] == ' ') {
				resultarray[i] =' ';
			}
		}
		
		int j=resultarray.length-1;
		for(int i=0;i<intputarray.length;i++)
		{
			
			if(intputarray[i]!=' ')
			{
			if(resultarray[j]==' ')
			{
				j--;
			}
			resultarray[j]=intputarray[i];
			j--;
			
			}
			
			
		}
		
		
		
		
		return resultarray;
		

	}

	public static void main(String[] args) {
		
		char[] array=stringreverse("BCA C");
		
		System.out.println(Arrays.toString(array));

	}

}
