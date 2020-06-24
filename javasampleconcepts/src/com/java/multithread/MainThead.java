package com.java.multithread;

public class MainThead {

	public static void main(String[] args) {

		MyThread mythd = new MyThread();

		mythd.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread is excuted");

		}

	}

}
