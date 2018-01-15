package com.iterator;

import java.util.Iterator;

public class LunchIterator implements Iterator<MenuItem> {

	private MenuItem[] menuItems = null;
	private int position = 0;

	public LunchIterator(MenuItem[] _menuItems) {
		this.menuItems = _menuItems;
	}

	@Override
	public boolean hasNext() {
		if (menuItems == null) {
			return false;
		}

		return position < menuItems.length;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}

}
