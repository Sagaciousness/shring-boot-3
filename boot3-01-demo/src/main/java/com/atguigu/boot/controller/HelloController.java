package com.atguigu.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jack丶WeTa
 * @Date 2023/7/20 16:02
 * @Description TODO
 */
@RestController
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "hello, springboot 3!";
    }


    @GetMapping("/incr")
    public String incr() {
        Long haha = redisTemplate.opsForValue().increment("haha");
        return "增加后的值：" + haha;
    }
}
