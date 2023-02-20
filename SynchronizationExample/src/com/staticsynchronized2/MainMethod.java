package com.staticsynchronized2;

public class MainMethod {

	public static void main(String[] args) {

		ThreadExample ex = new ThreadExample();
		ThreadClass1 th1 = new ThreadClass1(ex);
		Thread thread1 = new Thread(th1);
		thread1.start();
		Thread thread2 = new Thread(th1);
		thread2.start();

		ThreadClass2 th2 = new ThreadClass2(ex);
		Thread thread3 = new Thread(th2);
		thread3.start();
	}
}
