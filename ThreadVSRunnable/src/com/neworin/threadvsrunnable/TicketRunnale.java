package com.neworin.threadvsrunnable;

public class TicketRunnale {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread th1 = new Thread(myRunnable, "�߳�һ");
		Thread th2 = new Thread(myRunnable, "�̶߳�");
		Thread th3 = new Thread(myRunnable, "�߳���");
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
			ticketCount--;// �������Ʊ������һ��
			System.out.println(Thread.currentThread().getName() + "�߳�����һ��Ʊ��ʣ��Ʊ��Ϊ��" + ticketCount);
		}
	}
}
