package com.demo.Java8Study.utils;

import com.demo.Java8Study.dto.User;

public class Mapper {

    public User doubleTheAge(User user)
    {
        return new User().setAge(user.getAge()*2).setName(user.getName()) ;
    }
}
