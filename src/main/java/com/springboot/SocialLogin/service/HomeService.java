package com.springboot.SocialLogin.service;

import com.springboot.SocialLogin.domain.User;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public void bootStrap(){

        User user = new User();
        user.setFirstName("Prashant");
        user.setLastName("Singh");
        user.setUsername("shanky");
        user.setPassword("test");

        


    }
}
