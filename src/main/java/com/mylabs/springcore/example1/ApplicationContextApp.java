package com.mylabs.springcore.example1;


import com.mylabs.springcore.example1.beans.Employee;
import com.mylabs.springcore.example2.SpringCoreApplicationContextDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


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
