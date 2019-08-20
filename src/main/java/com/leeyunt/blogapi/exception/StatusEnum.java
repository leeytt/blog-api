package com.leeyunt.blogapi.exception;

import lombok.Getter;

/**
 *
 * 状态码枚举封装
 */
@Getter
public enum StatusEnum {
    /**
     * 操作成功
     */
    OK(200, "操作成功"),

    /**
     * 操作失败
     */
    FAIL(-1, "操作失败"),

    /**
     * 路径错误
     */
    URL_ERROR(404, "404 Not Found"),

    /**
     * 服务器异常
     */
    SERVER_ERROR(500, "服务器出错啦");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
