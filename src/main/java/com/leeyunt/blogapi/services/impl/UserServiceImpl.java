package com.leeyunt.blogapi.services.impl;

import com.leeyunt.blogapi.mapper.UserMapper;
import com.leeyunt.blogapi.entity.User;
import com.leeyunt.blogapi.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
