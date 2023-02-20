package com.methodlevel;

public class ThreadClass2 extends Thread {

	ThreadExample thread;

	public ThreadClass2(ThreadExample thread) {
		this.thread = thread;
	}

	public void run() {
		thread.printData(10);
	}
}
