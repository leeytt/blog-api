package com.leeyunt.blogapi.controller;

import com.leeyunt.blogapi.exception.JsonException;
import com.leeyunt.blogapi.exception.PageException;
import com.leeyunt.blogapi.exception.StatusEnum;
import com.leeyunt.blogapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/exception")
@Api(tags="异常处理测试Api")
public class TestController {
    @GetMapping("/json")
    @ResponseBody
    public ResultUtil jsonException() {
        throw new JsonException(StatusEnum.OK);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(StatusEnum.SERVER_ERROR);
    }
}
