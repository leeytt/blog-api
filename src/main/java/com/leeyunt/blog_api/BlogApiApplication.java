package com.leeyunt.blog_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.leeyunt.blog_api.dao") //自动扫描路径下的所有mapper
public class BlogApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApiApplication.class, args);
    }

}
