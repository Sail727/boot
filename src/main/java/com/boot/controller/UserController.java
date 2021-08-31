package com.boot.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boot.model.User;
import com.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public IService<User> getService() {
        return userService;
    }

}
