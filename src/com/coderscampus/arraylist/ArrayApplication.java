package com.coderscampus.arraylist;

import java.util.Arrays;

public class ArrayApplication {

	public static void main(String[] args) {
		CustomList<String> sut = new CustomArrayList<>();
		CustomList<Integer> numItems = new CustomArrayList<>();

		String[] colors = { "Red", "Yellow", "Blue", "Green", "Purple", "Orange", "Black", "White", "Brown", "Grey",
				"Pink", "Coral", "Gold", "Plum", "Orchid", "Indigo" 
				};
		for (String color : colors) {
			sut.add(color);
		}
		System.out.println(sut);
		System.out.println("--------------------------");
		sut.add(10, "Honey");
		System.out.println(sut);
		System.out.println("--------------------------");
		sut.remove(5);
		System.out.println(sut);
		System.out.println("--------------------------");

		for (int i = 0; i < 10; i++) {
			numItems.add(i);
		}
		System.out.println("--------------------------");
		System.out.println(sut.getSize());
		System.out.println(sut.get(10));
		System.out.println("--------------------------");
		System.out.println(numItems.getSize());
		System.out.println(numItems.get(8));
		System.out.println(numItems);

	}

}
