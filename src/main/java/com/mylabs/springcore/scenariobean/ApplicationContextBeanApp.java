package com.mylabs.springcore.scenariobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


// this  example for , how to use third party jar in your spring application using @Bean and @Configuration
@ComponentScan
public class ApplicationContextBeanApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextBeanApp.class);

		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.getUserInformation();

	}

}
