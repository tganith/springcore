package com.mylabs.springcore.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAOImpl {

    @Autowired
    private JdbcConnection jdbcConnection;

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public DAOImpl(JdbcConnection jdbcConnection){
        this.jdbcConnection = jdbcConnection;
        System.out.println("constructor injection XMLDAO created.");
    }

    public DAOImpl(){
        System.out.println("XMLDAO created.");
    }
}
