package com.iterator;

import java.util.Iterator;

public class Waitress {

	private Iterator<MenuItem> iterator = null;
    private Menu menu = null;
    
    public Waitress(Menu _menu) {
        this.menu = _menu;
    }
    
    public void printMenu() {
        System.out.println("\n菜单：");
        iterator = menu.createIterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
    }
}
