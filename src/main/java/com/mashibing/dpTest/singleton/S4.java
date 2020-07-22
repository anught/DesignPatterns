package com.mashibing.dpTest.singleton;

public enum S4 {
	INSTANCE("QQ");

	private String value;

	S4(String a) {
		this.value = a;
	}

	public void setValue(String a) {
		this.value = a;
	}

	public void m() {

	}

	public static void main(String[] args) {
		System.out.println(INSTANCE.value);
		INSTANCE.setValue("axb");
		System.out.println(INSTANCE.value);
	}
}
