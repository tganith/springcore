package com.mylabs.springcore.scope;


import com.mylabs.springcore.scope.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("")
public class ApplicationContextApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextApp.class);

		Employee emp = applicationContext.getBean(Employee.class);
		System.out.println(emp);
		System.out.println(emp.getAddress());

		System.out.println("-----------------");

		Employee emp1 = applicationContext.getBean(Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.getAddress());


	}

}
