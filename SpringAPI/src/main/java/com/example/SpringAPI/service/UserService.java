package com.example.SpringAPI.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"siddhu",18,"siddhu@gmail.com");
        User user2 = new User(2,"harry",21,"harry@sidemen.com");
        User user3 = new User(3,"josher",11,"josher@sidemen.com");
        User user4 = new User(4,"miniminter",17,"miniminter@outlook.com");
        User user5 = new User(5,"vik",28,"vikstar@sidemen.com");
        User user6 = new User(6,"jj",25,"jjksi@sidemen.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6));
    }

    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for(User user:userList){
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }

        }
        return optional;

    }
}
