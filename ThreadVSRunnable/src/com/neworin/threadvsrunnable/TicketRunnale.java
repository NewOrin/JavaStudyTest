package com.neworin.threadvsrunnable;

public class TicketRunnale {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread th1 = new Thread(myRunnable, "线程一");
		Thread th2 = new Thread(myRunnable, "线程二");
		Thread th3 = new Thread(myRunnable, "线程三");
		th1.start();
		th2.start();
		th3.start();
	}
}

class MyRunnable implements Runnable {

	private  int ticketCount = 5;

	@Override
	public void run() {
		while (ticketCount > 0) {
			ticketCount--;// 如果还有票就卖掉一张
			System.out.println(Thread.currentThread().getName() + "线程卖了一张票，剩余票数为：" + ticketCount);
		}
	}
}
