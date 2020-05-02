package com.mylabs.springcore.example1.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("123456")
    private int pin;
    @Value("my street")
    private String streetName;
    @Value("bangalore")
    private String city;


    public Address(){
        System.out.println("Address object created !!!");
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
