package com.mylabs.springcore.value;


import com.mylabs.springcore.value.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class ApplicationContextApp {

	// created IOC Container using application context and here used setter Injection
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextApp.class);

		Employee emp = (Employee)applicationContext.getBean(Employee.class);
		emp.display();
		emp.getAddress().display();



	}

}
