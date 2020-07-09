package com.java.singleton;

public class Singleton {

	static Singleton Singletonref;

	private Singleton() {

	}

	public static Singleton getinstance() {

		if (Singletonref == null) {
			Singletonref = new Singleton();
		}

		return Singletonref;
	}

}
