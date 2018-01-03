package com.jskj.ssm.mapper;

import com.jskj.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();
    User login(User user);
    int deleteUser(String userName);
    int updateUser(User user);
    int addUser(User user);
}
