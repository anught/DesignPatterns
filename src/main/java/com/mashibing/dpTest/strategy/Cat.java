package com.mashibing.dpTest.strategy;

public class Cat {
	public int h = 0;
	public int w = 1;
	private String name = "";

	public Cat(String name, int h, int w) {
		this.name = name;
		this.w = w;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Cat [h=" + h + ", w=" + w + ", name=" + name + "]";
	}

}
