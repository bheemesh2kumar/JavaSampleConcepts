package com.java.singleton;

public class TestSingleton {

	public static void main(String[] args) 
	{
		
		Singleton Singletonref1=Singleton.getinstance();
		Singleton Singletonref2=Singleton.getinstance();
		
		System.out.println(Singletonref1.hashCode());
		System.out.println(Singletonref2.hashCode());
		

	}

}
