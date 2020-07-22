package com.mashibing.dpTest.strategy;

public class CatComparator implements Comparator<Cat> {
	public int compareto(Cat c1, Cat c2) {
		if (c1.h > c2.h) {
			return 1;
		} else if (c1.h == c2.h) {
			return 0;
		} else {
			return -1;
		}
	}
}
