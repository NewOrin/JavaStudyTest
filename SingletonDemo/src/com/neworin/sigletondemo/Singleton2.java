package com.neworin.sigletondemo;

/**
 * 懒汉模式 区别：饿汉模式的特点是加载类是比较慢，但运行时获取对象的速度比较快，线程安全
 * 懒汉模式的特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 * 
 * @author Neworin
 *
 */
public class Singleton2 {

	// 1，将构造方法私有化，不允许外部直接创建对象
	private Singleton2() {
	}

	// 2,声明而(非创建)类的唯一实例，使用private static修饰
	private static Singleton2 instance;

	// 提供一个用于获取实例的方法，使用public static 修饰
	public static Singleton2 getInstance() {
		if (instance == null) {
			return instance = new Singleton2();
		}
		return instance;
	}
}
