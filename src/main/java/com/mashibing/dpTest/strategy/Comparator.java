package com.mashibing.dpTest.strategy;

@FunctionalInterface
public interface Comparator<T> {
	int compareto(T t1, T t2);
}
