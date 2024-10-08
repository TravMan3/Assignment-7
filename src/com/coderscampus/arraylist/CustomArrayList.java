package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer arrayCount = 0;

	@Override
	public boolean add(T item) {
		resizeArray(item);
		items[arrayCount] = item;
		arrayCount++;
		return true;
	}

	@Override
	public int getSize() {
		return arrayCount;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		checkForValidIndex(index);
		resizeArray(item);
		for (int i = arrayCount; i > index; i--) {
			items[i] = items[i - 1];
		}

		items[index] = item;
		arrayCount++;
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		checkForValidIndex(index);

		@SuppressWarnings("unchecked")
		T itemToRemove = (T) items[index];

		items[index] = null;
		for (int i = index; i < arrayCount -1; i++) {
			items[i] = items[i + 1];
		}
		items[arrayCount - 1] = null;
		arrayCount--;
		return itemToRemove;
		
	}

	public void resizeArray(T item) {
		if (arrayCount == items.length) {
			Object[] biggerItems = new Object[items.length * 2];
			System.arraycopy(items, 0, biggerItems, 0, items.length);
			biggerItems[arrayCount] = item;
			items = biggerItems;
		}
	}

	public void checkForValidIndex(int index) {
		if (index < 0 || index > arrayCount) {
			throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
		}
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", ArrayCount=" + arrayCount + "]";
	}
	

	
}
