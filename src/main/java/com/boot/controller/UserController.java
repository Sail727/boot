package com.boot.controller;

import com.boot.model.User;
import com.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUser")
    public User getUser(String id){
        return userService.getById(id);
    }

    @RequestMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping("/saveUpdate")
    public Boolean saveUpdate(User user){
        return userService.saveOrUpdate(user);
    }

    @RequestMapping("/remove")
    public Boolean remove(List<String> ids){
        return userService.removeByIds(ids);
    }

}
