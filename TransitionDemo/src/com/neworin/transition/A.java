package com.neworin.transition;

/**
 * Created by NewOrin Zhang on 2016/7/3. Email: NewOrinZhang@Gmail.com
 */
public class A {
	public A() {
		System.out.println("这是A的构造方法");
	}

	public void test() {
		System.out.println("A类的方法");
	}

	public static void main(String[] args) {
		A a = new A();
		a.test();
	}
}
