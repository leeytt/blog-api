package com.leeyunt.blogapi.exception;

/***
 *
 * JSON异常
 */
public class JsonException extends BaseException {

    public JsonException(StatusEnum statusEnum) {
        super(statusEnum);
    }

    public JsonException(Integer code, String msg) {
        super(code, msg);
    }
}
