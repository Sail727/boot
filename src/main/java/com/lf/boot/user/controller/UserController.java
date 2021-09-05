package com.lf.boot.user.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.boot.base.controller.BaseController;
import com.lf.boot.redis.RedisUtils;
import com.lf.boot.user.entity.User;
import com.lf.boot.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User> {

    private final IUserService userService;

    private final RedisUtils redisUtils;

    @Autowired
    public UserController(IUserService userService, RedisUtils redisUtils) {
        this.userService = userService;
        this.redisUtils = redisUtils;
    }

    @Override
    public IService<User> getService() {
        return userService;
    }

    @RequestMapping("/redis/set")
    public void setRedis(String key, String val) {
        redisUtils.set(key, val);
    }

    @RequestMapping("/redis/get")
    public String getRedis(String key) {
        return redisUtils.get(key);
    }

}
