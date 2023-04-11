package com.jsp.setter.inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PenDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(MyConfig.class);
     Pen pen = (Pen)applicationContext.getBean("pen");
     pen.printDetails();
	}

}
