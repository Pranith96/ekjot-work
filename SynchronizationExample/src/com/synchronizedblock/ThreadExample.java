package com.synchronizedblock;

public class ThreadExample {

	public void printData(int num) {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i * num);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("welcome");
		System.out.println("to java");

	}
}
