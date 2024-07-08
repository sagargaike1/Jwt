package com.jwt.example.service;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> list =new ArrayList<>();

    public UserService(){
       list.add(new User(UUID.randomUUID().toString(),"Sagar","sagar@gmail.com"));
       list.add(new User(UUID.randomUUID().toString(),"Ankit","Ankit@gmail.com"));
       list.add(new User(UUID.randomUUID().toString(),"suhit","suhit@gmail.com"));
       list.add(new User(UUID.randomUUID().toString(),"arvind","arvind@gmail.com"));

    }

    public List<User> getUsers(){
        return this.list;
    }
}
