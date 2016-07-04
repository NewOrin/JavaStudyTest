package com.neworin.transition;

/**
 * Created by NewOrin Zhang on 2016/7/3. Email: NewOrinZhang@Gmail.com
 */
public class C {
	public C() {
		System.out.println("这是C的构造方法");
	}

	public static void main(String[] args) {
		A a = new B();// 向上转型
		a.test();// 输出B类的方法1
		B b = (B) a;// 向下转型
		b.test2();// 输出B类的方法2
		A a2 = new A();
		// B b2 = (B) a2;不安全的向下转型,编译无错但会运行会出错
		// 解决办法
		if (a2 instanceof B) {
			B b2 = (B) a2;
			b2.test();
			b2.test2();
		}
	}
}
