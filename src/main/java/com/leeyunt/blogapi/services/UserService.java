package com.leeyunt.blogapi.services;

import com.leeyunt.blogapi.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
