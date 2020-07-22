package com.mashibing.dpTest.singleton;

public class SL1 {
	private static final SL1 INSTANCE = new SL1();

	private SL1() {

	}

	public static SL1 getInstance() {
		return INSTANCE;
	}

	public static void main(String[] args) {
		SL1 s1 = SL1.getInstance();
		SL1 s2 = SL1.getInstance();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
