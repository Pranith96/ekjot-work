package com.staticsynchronized2;

public class ThreadClass1 implements Runnable {

	ThreadExample thread;

	public ThreadClass1(ThreadExample thread) {
		this.thread = thread;
	}

	public void run() {
		thread.printData(5);
	}
}