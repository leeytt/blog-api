package com.leeyunt.blogapi.utils;

/**
 * 统一定义返回结果类
 *
 * @author leeyunt
 * @since 2019/8/16
 */
public class ResultUtil {
    /**
     * 返回状态码
     */
    private Integer code;//状态码，成功；1、失败；0

    /**
     * 返回消息
     */
    private String msg;//消息

    /**
     * 返回数据
     */
    private Object data;//数据

}