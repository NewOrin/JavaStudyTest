package com.neworin.threadvsrunnable;

public class TicketThread {
	public static void main(String[] args) {
		MyThread md1 = new MyThread("线程一");
		MyThread md2 = new MyThread("线程二");
		MyThread md3 = new MyThread("线程三");
		md1.start();
		md2.start();
		md3.start();
	}
}

class MyThread extends Thread {

	private int ticketCount = 5;// 一共5张火车票
	private String name;// 线程名字

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (ticketCount > 0) {
			ticketCount--;// 如果还有票就卖掉一张
			System.out.println(name + "线程卖了一张票，剩余票数为：" + ticketCount);
		}
	}

}