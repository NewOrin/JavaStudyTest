package com.neworin.sigletondemo;

/**
 * ����ģʽ ���𣺶���ģʽ���ص��Ǽ������ǱȽ�����������ʱ��ȡ������ٶȱȽϿ죬�̰߳�ȫ
 * ����ģʽ���ص��Ǽ�����ʱ�ȽϿ죬������ʱ��ȡ������ٶȱȽ������̲߳���ȫ
 * 
 * @author Neworin
 *
 */
public class Singleton2 {

	// 1�������췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton2() {
	}

	// 2,������(�Ǵ���)���Ψһʵ����ʹ��private static����
	private static Singleton2 instance;

	// �ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static ����
	public static Singleton2 getInstance() {
		if (instance == null) {
			return instance = new Singleton2();
		}
		return instance;
	}
}
