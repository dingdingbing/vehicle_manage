package com.igeek.service;

import com.igeek.pojo.User;

import java.util.Set;

public interface IUserService {
    User selectByName(String name);
    int registerUser(User user);
    Set<String> selectPerById(Integer userid);
}
