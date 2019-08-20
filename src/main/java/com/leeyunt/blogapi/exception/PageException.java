package com.leeyunt.blogapi.exception;

/**
 *
 * 页面异常
 */
public class PageException extends BaseException {

    public PageException(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public PageException(Integer code, String msg) {
        super(code, msg);
    }
}
