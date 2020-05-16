package com.mylabs.springcore.dependency1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SpringCoreApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreApplicationContextDemo.class);

		//applicationContext.getBean("serviceImpl");

		applicationContext.getBean(ServiceImpl.class);
	}

}
