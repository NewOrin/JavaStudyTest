package com.neworin.transition;

/**
 * Created by NewOrin Zhang on 2016/7/3. Email: NewOrinZhang@Gmail.com
 */
public class B extends A {
	public B() {
		System.out.println("这是B的构造方法");
	}

	public void test() {
		System.out.println("B类的方法1");
	}

	public void test2() {
		System.out.println("B类的方法2");
	}

	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
