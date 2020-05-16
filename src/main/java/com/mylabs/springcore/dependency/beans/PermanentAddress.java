package com.mylabs.springcore.dependency.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PermanentAddress implements Address{

    @Value("67890")
    private int pin;
    @Value("my permanent street")
    private String streetName;
    @Value("my permanent city")
    private String city;


    public PermanentAddress(){
        System.out.println("Permanent Address object created !!!");
    }

    public PermanentAddress(int pin, String streetName, String city){
        this.pin = pin;
        this.streetName = streetName;
        this.city = city;

    }

    public void display(){
        System.out.println("PIN :"+pin+" ,Street Name:"+streetName+" ,city:"+city);
    }


}
