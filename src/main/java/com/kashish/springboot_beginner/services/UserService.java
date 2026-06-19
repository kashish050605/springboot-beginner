package com.kashish.springboot_beginner.services;

import com.kashish.springboot_beginner.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    private List<User> allUsers;
    public UserService(){
        allUsers=new ArrayList<>();
        allUsers.add(new User(1,"John","Male","/images/john.png"));
        allUsers.add(new User(2,"Jane","Female","/images/jane.png"));
    }
    public List<User> getAllUsers(){
        return allUsers;
    }
    public User getUserById(int id){
        for(User user:allUsers){
            if(user.GetId()==id){
                return user;
            }
        }
        return null;
    }
    public User addUser(User user){
        user.SetId(allUsers.size()+1);
        allUsers.add(user);
        return user;
    }
}
