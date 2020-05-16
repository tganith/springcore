package com.mylabs.springcore.dependency;

import com.mylabs.springcore.dependency.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DependencyInjectionDemo {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionDemo.class);

        Employee emp = applicationContext.getBean(Employee.class);
        emp.display();
        emp.getAddress().display();
    }
}
