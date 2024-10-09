package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	@Test
	void should_add_one_item_to_the_list() {
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		customList.add(10);
		assertEquals(10, customList.get(0));
		assertEquals(1, customList.getSize());
	}

}
