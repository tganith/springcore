package com.mylabs.springcore.example2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringCoreApplicationContextDemo {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCoreApplicationContextDemo.class);

		//applicationContext.getBean("serviceImpl");

		applicationContext.getBean(ServiceImpl.class);
	}

}
