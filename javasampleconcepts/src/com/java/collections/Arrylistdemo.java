package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylistdemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Akash");
		al.add("Baskar");
		al.add("Cinnarao");
		al.add("Dinesh");
		al.add("Easha");
		
		System.out.println("Added objects");
		
		
		Iterator<String> itrator=al.iterator();
		
		while(itrator.hasNext())
		{
			String str=itrator.next();
			
			System.out.println(str);
		}
		
		
		System.out.println("***************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
