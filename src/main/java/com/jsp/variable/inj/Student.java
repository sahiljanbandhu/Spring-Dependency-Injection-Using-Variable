package com.jsp.variable.inj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "nishu")
   String name ;
	@Value (value = "nishu@gmail.com")
   String email;
	
	public void studentDetails() {
		System.out.println(name);
		System.out.println(email);
	}
}
