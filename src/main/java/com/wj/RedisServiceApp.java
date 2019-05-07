package com.wj;

import com.wj.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jun.wang
 * @title: RedisServiceApp
 * @projectName ownerpro
 * @description: TODO
 * @date 2019/5/7 9:52
 */

@SpringBootApplication
public class RedisServiceApp {

    @Autowired
    private RedisService redisService;

    public static void main(String args[]) {
        SpringApplication.run(RedisServiceApp.class, args);
    }
}
