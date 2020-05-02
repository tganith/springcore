package com.mylabs.springcore.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl {

    @Autowired
    private DAOImpl daoImpl;

    public void setDaoImpl(DAOImpl daoImpl) {
        this.daoImpl = daoImpl;
    }
}
