package com.jsp.variable.inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Student student=(Student)applicationContext.getBean("student");
		student.studentDetails();
	}

}
