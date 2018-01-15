package com.iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {

    private MenuItem[] menuItems = null;
    
    public LunchMenu() {
        menuItems = new MenuItem[5];
        initMenu();
    }
    
    private void initMenu() {
        menuItems[0] = new MenuItem("红烧肉", 10.0);
        menuItems[1] = new MenuItem("带鱼", 12.0);
        menuItems[2] = new MenuItem("土豆丝", 6.0);
        menuItems[3] = new MenuItem("鸡腿", 9.0);
        menuItems[4] = new MenuItem("红烧鱼", 10.0);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new LunchIterator(menuItems);
    }

}
