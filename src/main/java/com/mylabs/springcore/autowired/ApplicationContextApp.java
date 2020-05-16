package com.mylabs.springcore.autowired;


import com.mylabs.springcore.autowired.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class ApplicationContextApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextApp.class);

		Employee emp = (Employee)applicationContext.getBean(Employee.class);
		emp.display();
		emp.getAddress().display();



	}

}
