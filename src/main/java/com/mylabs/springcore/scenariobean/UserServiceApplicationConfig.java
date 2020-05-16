package com.mylabs.springcore.scenariobean;


import com.mylabs.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceApplicationConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

}
