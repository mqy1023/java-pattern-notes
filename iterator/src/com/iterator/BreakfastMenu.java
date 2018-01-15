package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu {

	private List<MenuItem> menuItems = null;

	public BreakfastMenu() {
		menuItems = new ArrayList<>();
	}

	public void addNewMenuItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
