package com.mashibing.dpTest.singleton;

//Mgr06 DCL
public class SL2 {
	private static volatile SL2 INSTANCE;

	private SL2() {

	}

	public static SL2 getInstance() {
		if (INSTANCE == null) {
			synchronized (SL2.class) {
				if (INSTANCE == null) {
					INSTANCE = new SL2();
				}
			}
		}

		return INSTANCE;
	}

	public void m() {
		System.out.println("mmmmmm");

	}

	public static void main(String[] args) {
		System.out.println(SL2.getInstance() == SL2.getInstance());

		SL2.getInstance().m();
	}
}
