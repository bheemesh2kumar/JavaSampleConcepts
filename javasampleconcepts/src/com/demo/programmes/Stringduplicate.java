package com.demo.programmes;

public class Stringduplicate {

	public static void Stringduplicate(String str) {
		for (int i = 0; i < str.length(); i++) 
		{
			
			int counter=0;

			for (int j = 0; j < str.length(); j++) 
			
			
			{
				
				if(str.charAt(i)==str.charAt(j)&& i>j)
				{
					break;
				}
				
				if(str.charAt(j)==str.charAt(i))
				{
					counter++;
				}

			}
			
			if(!(counter==0))
			System.out.println(str.charAt(i)+ " "+ counter);

		}
	}

	public static void main(String[] args) {
		
		Stringduplicate("apple");

	}

}
