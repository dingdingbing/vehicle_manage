package com.igeek.service.Impl;

import com.igeek.mapper.UserMapper;
import com.igeek.pojo.User;
import com.igeek.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public int registerUser(User user) {

        return userMapper.registerUser(user);
    }

    @Override
    public Set<String> selectPerById(Integer userid) {
        return userMapper.selectPerById(userid);
    }
}
