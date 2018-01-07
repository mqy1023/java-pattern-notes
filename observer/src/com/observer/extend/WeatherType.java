package com.observer.extend;

/**
 * 
 * WeatherType enumeration
 * 
 */
public enum WeatherType {

  SUNNY, RAINY, WINDY, COLD;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
