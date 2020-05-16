package com.mylabs.springcore.scope.beans;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Address {

    @Value("123456")
    private int pin;
    @Value("my street")
    private String streetName;
    @Value("bangalore")
    private String city;


    public Address(){

    }

    public Address(int pin, String streetName, String city){
        this.pin = pin;
        this.streetName = streetName;
        this.city = city;

    }

    public void display(){
        System.out.println("PIN :"+pin+" ,Street Name:"+streetName+" ,city:"+city);
    }


}
