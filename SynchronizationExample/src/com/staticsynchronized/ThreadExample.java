package com.staticsynchronized;

public class ThreadExample {

	public static synchronized void printData(int num) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i * num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("welcome");
		System.out.println("to java");

	}
}
