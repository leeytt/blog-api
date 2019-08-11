package com.leeyunt.blogapi.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private static final long serialVersionUID = 1L;
    private Object aid;//aid
    private String user_id;//用户id
    private String username;//账号
    private String password;//密码
    private String salt;//秘钥
    private String access_token;//access_token
    private Integer token_expires_in;//token有效期至
    private Timestamp create_time;//创建时间
    private Boolean status;//状态，1为正常，默认1
    private Timestamp last_login_time;//最后登录时间
}
