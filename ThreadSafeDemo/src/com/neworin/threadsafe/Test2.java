package com.neworin.threadsafe;

/**
 * Java中使用synchronized保证一段代码在多线程执行时是互斥的，有两种用法：
 * 
 * @author Neworin
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Outputter outputter = new Outputter();
		// 线程一
		new Thread() {
			public void run() {
				 outputter.output2("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			};
		}.start();

		// 线程二
		new Thread() {
			public void run() {
				 outputter.output2("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			};
		}.start();
	}
}

class Outputter {
	/**
	 * 互斥方法1
	 * 
	 * 1. 使用synchronized将需要互斥的代码包含起来，并上一把锁。
	 */
	public void output1(String name) {

		// 为了保证对name的输出不是一个原子操作，这里逐个输出name的每个字符
		synchronized (this) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i) + "");
			}
		}
		/**
		 * 这把锁必须是需要互斥的多个线程间的共享对象，像下面的代码是没有意义的
		 * 
		 */
		// {
		// Object lock = new Object();
		// synchronized (lock) {
		// for(int i = 0; i < name.length(); i++) {
		// System.out.print(name.charAt(i));
		// }
		// }
		// }
	}

	/**
	 * 互斥方法2
	 * 
	 * 将synchronized加在需要互斥的方法上
	 */
	public synchronized void output2(String name) {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
	}

}