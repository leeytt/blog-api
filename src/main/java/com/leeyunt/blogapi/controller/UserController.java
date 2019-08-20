package com.leeyunt.blogapi.controller;


import com.leeyunt.blogapi.entity.User;
import com.leeyunt.blogapi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@RestController
@RequestMapping("/user")
@Api(tags="管理员Api")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取管理员列表
     * @return List<User>
     */
    @GetMapping("/getAll")
    @ApiOperation(value = "获取列表", notes = "获取所有记录")
    public List<User> getAll(){
        return userService.list();
    }

    /**
     * 添加管理员
     * @return Boolean
     */
    @PostMapping("/addUser")
    @ApiOperation(value = "添加管理员", notes = "添加记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "账号", defaultValue = "李四", required = true),
            @ApiImplicitParam(name = "password", value = "密码", defaultValue = "123456", required = true)
    })
    public Boolean addUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userService.save(user);
    }

    /**
     * 根据id查询管理员
     * @return User
     */
    @GetMapping("/{userId}")
    @ApiOperation(value = "根据id查询", notes = "根据id查询记录")
    @ApiImplicitParam(name = "userId", value = "用户id", defaultValue = "1", required = true)
    public User getUserById(@PathVariable("userId") Integer userId) {
        return userService.getById(userId);
    }

    /**
     * 根据id动态更新管理员
     */
    @PutMapping("/updateUser")
    @ApiOperation(value = "根据id动态更新", notes = "根据id动态更新记录")
    public Boolean updateUserById(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    /**
     * 根据id删除管理员
     * @return boolean
     */
    @DeleteMapping("/{userId}")
    @ApiOperation(value = "根据id删除", notes = "根据id删除记录")
    @ApiImplicitParam(name = "userId", value = "用户id", defaultValue = "99", required = true)
    public boolean deleteUserById(@PathVariable("userId") Integer userId) {
        return userService.removeById(userId);
    }
}
