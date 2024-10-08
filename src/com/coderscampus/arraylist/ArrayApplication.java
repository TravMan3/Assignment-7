package com.coderscampus.arraylist;

import java.util.Arrays;

public class ArrayApplication {

	public static void main(String[] args) {
		CustomList<String> sut = new CustomArrayList<>();
		CustomList<Integer> numItems = new CustomArrayList<>();
		
		sut.add("Red");
		sut.add("Yellow");
		sut.add("Blue");
		sut.add("Green");
		sut.add("Purple");
		sut.add("Orange");
		sut.add("Black");
		sut.add("White");
		sut.add("Brown");
		sut.add("Grey");
		sut.add("Pink");
		sut.add("Coral");
		sut.add("Gold");
		sut.add("Plum");
		sut.add("Orchid");
		sut.add("Indigo");
		System.out.println(sut);
		sut.add(10, "Honey");
		sut.remove(5);
		System.out.println(sut);
		System.out.println(sut);
		System.out.println("--------------------------");
		for(int i = 0; i< 10; i++) {
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
