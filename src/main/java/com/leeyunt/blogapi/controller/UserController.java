package com.leeyunt.blogapi.controller;


import com.leeyunt.blogapi.entity.User;
import com.leeyunt.blogapi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@RestController
@RequestMapping("/blogapi/user")
@Api(value = "管理员类控制器",tags="管理员类控制器")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     *
     * @author leeyunt
     * @since 2019-08-13
     */
    @RequestMapping("/getAll")
    @ApiOperation(value = "获取用户列表",notes = "获取用户列表")
    public List<User> getAll(){
        return userService.list();
    }

}
