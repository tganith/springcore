package com.mylabs.springcore.scenariobean;

import com.mylabs.user.User;
import com.mylabs.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    @Autowired
    UserService userService;

    public List<User> getUserInformation(){

        System.out.print("calling users service from orderservice");

        List<User> users = userService.getUsers();

        for(User user:users){
            System.out.println(user.getName()+" "+user.getAddress());
        }
        return users;
    }


}
