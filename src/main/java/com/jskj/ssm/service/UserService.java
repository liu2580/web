package com.jskj.ssm.service;

import com.jskj.ssm.model.User;
import com.jskj.ssm.util.ActionReturnUtil;


public  interface UserService {
    ActionReturnUtil login(String userName, String passWord);
    ActionReturnUtil  getAll();
    ActionReturnUtil deleteUser(String userName);
    ActionReturnUtil updateUser(User user);
    ActionReturnUtil addUser(User user);
    ActionReturnUtil addUsernew(String userName, String passWord);

}
