package com.strategy;

public class Test {

    
    public static void main(String[] args) {
    	 Context context;  
    	  
    	 context = new Context(new AStrategy());  
         context.operate();  
         System.out.println("\n");  
      
         context.setStrategy(new AStrategy());  
         context.operate();  
         System.out.println("\n");  
      
         context.setStrategy(new AStrategy());  
         context.operate();  
    }
    
}
