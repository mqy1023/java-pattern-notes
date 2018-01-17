package com.proxy;

/**
 * 
 * The object to be proxyed.
 * 
 */
public class IvoryTower implements WizardTower {

  public void enter(Wizard wizard) {
    System.out.println("{} enters the tower." + wizard);
  }

}
