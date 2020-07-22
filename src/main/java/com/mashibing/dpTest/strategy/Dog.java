package com.mashibing.dpTest.strategy;

public class Dog {
	private int h = 0;
	private int w = 1;
	private String name = "";

	public Dog(String name, int h, int w) {
		this.name = name;
		this.w = w;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Cat [h=" + h + ", w=" + w + ", name=" + name + "]";
	}

}