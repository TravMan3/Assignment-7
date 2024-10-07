package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer arrayCount = 0;
	
	@Override
	public boolean add(T item) {
		if (arrayCount == items.length) {
			Object[] biggerItems = new Object[items.length * 2];
			System.arraycopy(items,0, biggerItems, 0, items.length);
			biggerItems[arrayCount] = item;	
			items = biggerItems;
		} else {
			items[arrayCount] = item;
		}
		arrayCount++;
		System.out.println(item);
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
	
}
