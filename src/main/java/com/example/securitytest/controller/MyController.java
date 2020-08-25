package com.example.securitytest.controller;

import com.example.securitytest.modals.User;
import com.example.securitytest.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @Autowired
    UserRepo UserRepo;

   /* 
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        if(accountService.findUserByUsername(user.getUsername()) != null)
            throw new RuntimeException("utilisateur deja existe");
        accountService.saveUser(user);
        return user;
    }

    @PostMapping("/addRoleToUser")
    public void addRoleToUser(@RequestBody String data) {
        System.err.println(data);
        System.err.println(data.split("$$")[0]);
        System.err.println(data.split("$$")[1]);
        accountService.addRoleToUser(data.split("$$")[0],data.split("$$")[1]);
    }*/
    @GetMapping("/")
    public String entry(@RequestBody User user) {
        
        return "welcome";
    }
}