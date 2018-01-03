package com.jskj.ssm.controller;

import com.jskj.ssm.model.User;
import com.jskj.ssm.service.UserService;
import com.jskj.ssm.util.ActionReturnUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ActionReturnUtil login(@RequestParam(value = "userName") final String userName, @RequestParam(value = "passWord") final String passWord){
        return userService.login(userName,passWord);
    }

    @RequestMapping(value = "/addUsernew",method = RequestMethod.GET)
    public ActionReturnUtil addUser1(@RequestParam(value = "userName") final String userName, @RequestParam(value = "passWord") final String passWord){
        return userService.addUsernew(userName,passWord);
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ActionReturnUtil showUser()throws Exception{
        return userService.getAll();
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    public ActionReturnUtil deleteUser(@RequestParam(value = "userName") final String userName) throws Exception{
        return userService.deleteUser(userName);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public ActionReturnUtil updateUser(User user) throws Exception{
        return userService.updateUser(user);
    }

    @RequestMapping(value="/addUser",method = RequestMethod.GET)
    public ActionReturnUtil addUser(User user)throws Exception{
        return userService.addUser(user);
    }

}
