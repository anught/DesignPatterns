package com.mashibing.dpTest.singleton;

//静态内部类的方式 由jvm保证只执行一次
//加载外部类时不会加载内部类；可以实现懒加载
public class SL3 {
	private static SL3 INSTANCE;

	private SL3() {
	}

	private static class SLHandler {
		private static final SL3 innerInstance = new SL3();
	}

	public static SL3 getInstance() {
		return SLHandler.innerInstance;
	}

	public void m() {
		System.out.println("ddddddd");
	}

	public static void main(String[] args) {
		SL3 s3 = SL3.getInstance();
		s3.m();
		SL3 s4 = SL3.getInstance();
		System.out.println(s3 == s4);
	}
}
