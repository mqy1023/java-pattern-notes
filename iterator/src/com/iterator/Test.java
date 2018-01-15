package com.iterator;

public class Test {

	private Menu menu = null;
    private Waitress waitress = null;
    
    public static void main(String[] args) {
        Test client = new Test();
        client.initEvent();
        client.operate();
    }
    
    private void initEvent() {
        menu = new BreakfastMenu();
//        BreakfastMenuUtils.initMenuItem((BreakfastMenu)menu);
        
        menu = new LunchMenu();
        
        waitress = new Waitress(menu);
    }
    
    private void operate() {
        waitress.printMenu();
    }
}
