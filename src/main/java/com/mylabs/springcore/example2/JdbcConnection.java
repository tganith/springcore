package com.mylabs.springcore.example2;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection(){
        System.out.println("connected database connection");
    }


}
