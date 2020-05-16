package com.mylabs.springcore.dependency.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class LocalAddress implements  Address{

    @Value("123456")
    private int pin;
    @Value("my local street")
    private String streetName;
    @Value("my local city")
    private String city;


    public LocalAddress(){
        System.out.println("Local Address object created !!!");
    }

    public LocalAddress(int pin, String streetName, String city){
        this.pin = pin;
        this.streetName = streetName;
        this.city = city;

    }

    public void display(){
        System.out.println("PIN :"+pin+" ,Street Name:"+streetName+" ,city:"+city);
    }


}
