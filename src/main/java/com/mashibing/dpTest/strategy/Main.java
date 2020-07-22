package com.mashibing.dpTest.strategy;

public class Main {
	public static void main(String[] args) {
		Cat[] listC = { new Cat("2", 2, 2), new Cat("1", 16, 1), new Cat("3", 3, 3), new Cat("2", 2, 2),
				new Cat("1", 18, 1), new Cat("3", 13, 3) };

		Sort<Cat> st = new Sort();
		// st.sorter(listC, new CatComparator());

		st.sorter(listC, (o1, o2) -> {
			if (o1.h < o2.h)
				return 1;
			else if (o1.h > o2.h)
				return -1;
			else
				return 0;
		});

		for (Cat c : listC) {
			System.out.println(c);
		}
	}
}
