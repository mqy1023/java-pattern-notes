package com.proxy;


public class App {

  /**
   * Program entry point
   */
  public static void main(String[] args) {

    WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
    proxy.enter(new Wizard("Red wizard"));
    proxy.enter(new Wizard("White wizard"));
    proxy.enter(new Wizard("Black wizard"));
    proxy.enter(new Wizard("Green wizard"));
    proxy.enter(new Wizard("Brown wizard"));

  }
}
