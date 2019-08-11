package com.leeyunt.blogapi.controller;

import com.leeyunt.blogapi.entity.User;
import com.leeyunt.blogapi.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/Admin")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/findAll")
    public List<User> findAll() { return userService.findAll(); }
}
