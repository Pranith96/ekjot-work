package com.methodlevel;

public class ThreadClass1 extends Thread {

	ThreadExample thread;

	public ThreadClass1(ThreadExample thread) {
		this.thread = thread;
	}

	public void run() {
		thread.printData(5);
	}
}
