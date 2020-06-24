package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {

		HashSet<String> hasval = new HashSet<String>();
		hasval.add("Test1");
		hasval.add("Test1");
		
		Iterator<String> st=hasval.iterator();
		
		
		while(st.hasNext())
		{
			System.out.println(st.next());
		}

	}

}
