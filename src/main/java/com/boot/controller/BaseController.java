package com.boot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

public abstract class BaseController<T> {

    public abstract IService<T> getService();

    @RequestMapping("/page")
    public Page<T> page(Page<T> page) {
        return this.getService().page(page);
    }

    @RequestMapping("/list")
    public List<T> list() {
        return this.getService().list();
    }

    @RequestMapping("/getById")
    public T getById(String id) {
        return this.getService().getById(id);
    }

    @RequestMapping("/saveOrUpdate")
    public Boolean saveOrUpdate(T entity) {
        return this.getService().saveOrUpdate(entity);
    }

    @RequestMapping("/remove")
    public Boolean remove(String[] ids) {
        return this.getService().removeByIds(Arrays.asList(ids));
    }

}
