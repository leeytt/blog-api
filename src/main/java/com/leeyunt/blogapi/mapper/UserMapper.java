package com.leeyunt.blogapi.mapper;

import com.leeyunt.blogapi.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有信息
     * @return 管理员列表
     * */

    @Select("SELECT * FROM admin")
    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password")
    })
    List<User> findAll();
}
