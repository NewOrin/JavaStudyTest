package com.neworin.sigletondemo;

/*
 * ����ģʽSingleton
 * Ӧ�ó��ϣ���Щ����ֻ��Ҫһ���͹��ˣ���Ŵ��Ļʵ�
 * ���ã���֤����Ӧ�ó����ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 */
/**
 * ����ģʽ
 * 
 * @author Neworin
 *
 */
public class Singleton {
	// 1,�����췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton() {
	}

	// 2,�������Ψһʵ��,ʹ��private static����
	private static Singleton instance = new Singleton();

	// 3,�ṩһ�����ڻ�ȡʵ���ķ���,ʹ��public static����
	public static Singleton getInstance() {
		return instance;
	}
}
