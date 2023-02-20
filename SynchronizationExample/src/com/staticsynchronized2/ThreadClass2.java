package com.staticsynchronized2;

public class ThreadClass2 implements Runnable {

	ThreadExample thread;

	public ThreadClass2(ThreadExample thread) {
		this.thread = thread;
	}

	public void run() {
		thread.printData(10);
	}
}