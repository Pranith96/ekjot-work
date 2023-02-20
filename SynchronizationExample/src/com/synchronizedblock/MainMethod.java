package com.synchronizedblock;

import com.methodlevel.ThreadClass1;
import com.methodlevel.ThreadClass2;
import com.methodlevel.ThreadExample;

public class MainMethod {

	public static void main(String[] args) {

		ThreadExample ex = new ThreadExample();
		ThreadClass1 thread1 = new ThreadClass1(ex);
		thread1.start();
		ThreadClass2 thread2 = new ThreadClass2(ex);
		thread2.start();
	}
}
