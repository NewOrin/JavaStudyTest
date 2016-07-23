package com.neworin.threadvsrunnable;

public class TicketThread {
	public static void main(String[] args) {
		MyThread md1 = new MyThread("�߳�һ");
		MyThread md2 = new MyThread("�̶߳�");
		MyThread md3 = new MyThread("�߳���");
		md1.start();
		md2.start();
		md3.start();
	}
}

class MyThread extends Thread {

	private int ticketCount = 5;// һ��5�Ż�Ʊ
	private String name;// �߳�����

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (ticketCount > 0) {
			ticketCount--;// �������Ʊ������һ��
			System.out.println(name + "�߳�����һ��Ʊ��ʣ��Ʊ��Ϊ��" + ticketCount);
		}
	}

}