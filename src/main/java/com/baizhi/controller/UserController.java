package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("oneUser")
    public String oneUser(Model model){
        User user = userMapper.selectByPrimaryKey(1);
        model.addAttribute("user",user);
        return "index";
    }
    @RequestMapping("allUsers")
    @ResponseBody
    public List<User> allUsers(){
        List<User> users = userMapper.selectAll();
        return users;
    }
}
