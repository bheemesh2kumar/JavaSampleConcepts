package com.demo.programmes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Tom", 1);
		hashmap.put("John", 2);
		hashmap.put("Ben", 3);
		hashmap.put("Park", 4);

		System.out.println(hashmap.toString());

		System.out.println("***************************");

		Set<Entry<String, Integer>> entryset = hashmap.entrySet();

		for (Entry<String, Integer> val : entryset) {
			System.out.println(val.getKey() + " " + val.getValue());
		}

		System.out.println("*******************************");
		
		ArrayList<HashMap<String, Integer>> arrymap=new ArrayList<HashMap<String, Integer>>();
		
		arrymap.add(hashmap);
		
		System.out.println(arrymap.get(0));

		

	}

}
