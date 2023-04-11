package com.jsp.setter.inj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
  private String name ;
  private String colur;
public String getName() {
	return name;
}
@Value(value = "Trimax")
public void setName(String name) {
	this.name = name;
}
public String getColur() {
	return colur;
}
@Value(value = "black")
public void setColur(String colur) {
	this.colur = colur;
}
  
  
  public void printDetails() {
	  System.out.println(this.name);
	  System.out.println(this.colur);
  }
}
