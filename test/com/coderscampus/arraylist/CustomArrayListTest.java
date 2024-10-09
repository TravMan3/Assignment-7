package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	

	@Test
	void should_add_one_item_to_the_list () {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(10);
		Integer result = sut.get(0);
		Integer size = sut.getSize();

		assertEquals(10, result);
		assertEquals(1, size);
	}

	@Test
	void should_add_11_items_to_list () {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i < 11; i++) {
			sut.add(i);
		}
		assertEquals(11, sut.getSize());
		for (int i = 0; i < 11; i++) {
			assertEquals(i, sut.get(i));
		}
	}
	
	@Test
	void should_remove_an_item_from_list () {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i < 11; i++) {
			sut.add(i);
		}
		sut.remove(5);
		assertEquals(6, sut.get(5));
		assertEquals(10, sut.getSize());
	}

	@Test
	void should_add_item_at_index () {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i < 11; i++) {
			sut.add(i);
		}
		sut.add(7, 2963);
		assertEquals(2963, sut.get(7));
	}

}