package com.demo.programmes;

public class BinarySearch2 {
	
	////when 4 elemets are there ,when searching for last element in arry index value

	public static void getmynumberusingbs(int[] arry, int num) {

		int start = 0;
		int end = arry.length - 1;
		int mid = (start + end) / 2;// 1

		// 1234

		while (start <= end) 
		{
			if (arry[mid] == num) 
			{
				System.out.println("number located" + num + " " + mid);
				
				break;
			}
			
			
			else if(num>arry[mid])
			{
				start=mid+1;
			}
			
			
			else
			{
				end=mid-1;
				
			}
			
			
			
			mid=(start+end)/2;
			
			if(start>end)
			{
				System.out.println("nummber is not  in index");
			}
			
			
			

		}
		
		
		 
		{
			
		}
		
		
		
		
		

	}

	public static void main(String[] args) {
		
		
		int[] inarry= {2,3,4,5};
		
		getmynumberusingbs(inarry,10);
		

	}

}
