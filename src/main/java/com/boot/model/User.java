package com.boot.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "T_USER")
public class User extends BaseModel {

    @TableField(value = "USERNAME")
    private String username;

    @TableField(value = "PASSWORD")
    private String password;

    @TableField(value = "NAME")
    private String name;

    @TableField(value = "EMAIL")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
