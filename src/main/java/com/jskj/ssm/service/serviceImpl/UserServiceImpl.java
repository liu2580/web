package com.jskj.ssm.service.serviceImpl;

import com.jskj.ssm.mapper.UserMapper;
import com.jskj.ssm.model.User;
import com.jskj.ssm.service.UserService;
import com.jskj.ssm.util.ActionReturnUtil;
import com.jskj.ssm.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public ActionReturnUtil getAll(){
        List<User> userList = userMapper.getAllUser();
        List<Map<String,Object>> list = new ArrayList<>();
        for(int i=0;i<userList.size();i++){
            User user = userList.get(i);
            Map<String,Object> map = new HashMap<>();
            map.put("userName",user.getUserName());
            map.put("passWord",user.getPassWord());
            map.put("addc",user.getAddc());
            list.add(map);
        }
        return ActionReturnUtil.returnSuccessWithData(list);
    }

    @Override
    public ActionReturnUtil login(String userName, String passWord){
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        if(userMapper.login(user)!=null) {
            HttpSession session = SessionUtil.getSession();
            session.setAttribute("user",userName);
            return ActionReturnUtil.returnSuccess();
        }else {
            return ActionReturnUtil.returnError();
        }
    }

    @Override
    public ActionReturnUtil deleteUser(String userName){
        if(userMapper.deleteUser(userName)!=0){
            return ActionReturnUtil.returnSuccess();
        }else{
            return ActionReturnUtil.returnError();
        }
    }

    @Override
    public ActionReturnUtil updateUser(User user){
        if(userMapper.updateUser(user)!=0){
            return ActionReturnUtil.returnSuccess();
        }else{
            return ActionReturnUtil.returnError();
        }
    }
    @Override
    public ActionReturnUtil addUser(User user){
        if(userMapper.addUser(user)!=0){
            return ActionReturnUtil.returnSuccess();
        }else{
            return ActionReturnUtil.returnError();
        }
    }



    @Override
    public ActionReturnUtil addUsernew(String userName, String passWord){
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(passWord);
        if(userMapper.addUser(user)!=0){
            return ActionReturnUtil.returnSuccess();
        }else{
            return ActionReturnUtil.returnError();
        }
    }
}
