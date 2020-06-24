package com.demo.programmes;

public class BinarySearchalgo {
	
	public static void getindexbybinary(int arry[],int num)
	{//2345
		
		int lower=0;//4
		int upper=arry.length;//3
		int mid=(lower+upper)/2;//3
		
		//when 4 elemets are there ,when searching for last element
		
		
		while(lower<=upper)
		{
			
			if(arry[mid]==num)
			{
				System.out.println("my number is at " + mid);
				
				break;
			}
			
			
			else if (num>arry[mid])
			{
				lower=mid+1;
			}
			
			else
			{
				upper=mid-1;
			}
			
			
			mid= (lower+upper)/2;
			
		}
		
		
		
		
		if(lower>upper)
		{
			System.out.println("No found");
		}
		
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		int[] arryin= {2,3,4};
		getindexbybinary(arryin,5);

	}

}
