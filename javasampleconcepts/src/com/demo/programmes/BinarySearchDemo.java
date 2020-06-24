package com.demo.programmes;

public class BinarySearchDemo {
	
	//123==1
	
	
	public static void getbinarysearch(int[] ary,int num)
	{
		int first=0;
		int last=ary.length-1;
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			
			if(num==ary[mid])
			{
				System.out.println("my number" + num + " " + "located at" + " " + ary[mid] );
				break;
			}
			
			else if (num>ary[mid])
			{
				first=mid+1;
				
			}
			
			else
			{
				last=mid-1;
			}
			
			mid=(first+last)/2;
			
		}
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7};
		
		getbinarysearch(array,2);
		

	}

}
