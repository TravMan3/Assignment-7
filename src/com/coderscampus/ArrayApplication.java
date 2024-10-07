package com.coderscampus;

public class ArrayApplication {

	public static void main(String[] args) {
		CustomList<String> items = new CustomArrayList<>();
		CustomList<Integer> numItems = new CustomArrayList<>();
		
		items.add("Red");
		items.add("Yellow");
		items.add("Blue");
		items.add("Green");
		items.add("Purple");
		items.add("Orange");
		items.add("Black");
		items.add("White");
		items.add("Brown");
		items.add("Grey");
		items.add("Pink");
		items.add("Coral");
		items.add("Gold");
		items.add("Plum");
		items.add("Orchid");
		items.add("Indigo");
		System.out.println("--------------------------");
		for(int i = 0; i< 161; i++) {
			numItems.add(i);
		}
		System.out.println("--------------------------");
		System.out.println(items.getSize());
		System.out.println(items.get(10));
		System.out.println("--------------------------");
		System.out.println(numItems.getSize());
		System.out.println(numItems.get(28));
		
		
	}

}
