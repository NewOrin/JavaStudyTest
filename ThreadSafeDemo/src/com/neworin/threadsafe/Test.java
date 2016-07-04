package com.neworin.threadsafe;

public class Test {
	public static void main(String[] args) {
		MyThreadRunnable runnable1 = new MyThreadRunnable(1);
		MyThreadRunnable runnable2 = new MyThreadRunnable(2);
		Thread thread1 = new Thread(runnable1, "线程1");
		Thread thread2 = new Thread(runnable2, "线程2");
		thread1.start();
		thread2.start();
	}
}
