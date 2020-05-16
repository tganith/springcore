package com.mylabs.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("application.properties")
public class PropertiesDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesDemo.class);

        Properties properties = applicationContext.getBean(Properties.class);
        System.out.println(properties.getProperty1());
        System.out.println(properties.getProperty2());
    }
}
