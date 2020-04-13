package com.igeek.mapper;

import com.igeek.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserMapper {
    User selectByName(String name);
    int registerUser(User user);
    Set<String> selectPerById(Integer userid);
}
