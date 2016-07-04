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
	 * �˷��������߳�ͬ�����̷߳ǰ�ȫ
	 * 
	 * @param value
	 */
	private synchronized void test1(int value) {
		for (int i = 0; i < 10; i++) {
			System.out.print(value);
		}
	}

	/**
	 * �˷������߳�ͬ�����̰߳�ȫ
	 * 
	 * @param value
	 */
	private void test2(int value) {
		// �̰߳�ȫ
		synchronized (MyThreadRunnable.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print(value);
			}
		}
	}
}
