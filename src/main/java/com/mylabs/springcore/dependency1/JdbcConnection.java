package com.mylabs.springcore.dependency1;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection(){
        System.out.println("connected database connection");
    }


}
