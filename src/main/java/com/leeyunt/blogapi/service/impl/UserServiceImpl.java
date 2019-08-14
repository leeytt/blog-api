package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.User;
import com.leeyunt.blogapi.mapper.UserMapper;
import com.leeyunt.blogapi.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
