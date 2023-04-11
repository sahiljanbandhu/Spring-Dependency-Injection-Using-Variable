package com.jsp.construtor.inj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
 String name;
 String brand ;
 public Car(@Value (value = "Tata") String name ,@Value(value = "nexon") String brand) {
	this.name = name;
	this.brand= brand;
	
}
  public void printCar() {
	  System.out.println(name);
	  System.out.println(brand);
  }
}
