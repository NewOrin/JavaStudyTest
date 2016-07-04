package com.neworin.threadsafe;

public class MyThreadRunnable implements Runnable {

	private int val;

	public MyThreadRunnable(int v) {
		val = v;
	}

	@Override
	public void run() {
		// test1(val);
		test2(val);
	}

	/**
	 * 此方法不能线程同步，线程非安全
	 * 
	 * @param value
	 */
	private synchronized void test1(int value) {
		for (int i = 0; i < 10; i++) {
			System.out.print(value);
		}
	}

	/**
	 * 此方法能线程同步，线程安全
	 * 
	 * @param value
	 */
	private void test2(int value) {
		// 线程安全
		synchronized (MyThreadRunnable.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print(value);
			}
		}
	}
}
