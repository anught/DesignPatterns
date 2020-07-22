package com.mashibing.dpTest.strategy;

public class Sort<T> {
	public void sorter(T[] t, Comparator<T> c) {
		int minPos = -1;
		for (int i = 0; i < t.length - 1; i++) {
			minPos = i;
			for (int j = i + 1; j < t.length; j++) {
				if (c.compareto(t[minPos], t[j]) > 0) {
					minPos = j;
				}
			}
			swap(t, i, minPos);
		}
	}

	public void swap(T[] t, int i, int j) {
		T tmp = t[i];
		t[i] = t[j];
		t[j] = tmp;

	}
}
