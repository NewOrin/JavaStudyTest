package com.neworin.threadsafe;

/**
 * Java��ʹ��synchronized��֤һ�δ����ڶ��߳�ִ��ʱ�ǻ���ģ��������÷���
 * 
 * @author Neworin
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Outputter outputter = new Outputter();
		// �߳�һ
		new Thread() {
			public void run() {
				 outputter.output2("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			};
		}.start();

		// �̶߳�
		new Thread() {
			public void run() {
				 outputter.output2("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			};
		}.start();
	}
}

class Outputter {
	/**
	 * ���ⷽ��1
	 * 
	 * 1. ʹ��synchronized����Ҫ����Ĵ����������������һ������
	 */
	public void output1(String name) {

		// Ϊ�˱�֤��name���������һ��ԭ�Ӳ���������������name��ÿ���ַ�
		synchronized (this) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i) + "");
			}
		}
		/**
		 * �������������Ҫ����Ķ���̼߳�Ĺ������������Ĵ�����û�������
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
	 * ���ⷽ��2
	 * 
	 * ��synchronized������Ҫ����ķ�����
	 */
	public synchronized void output2(String name) {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
	}

}