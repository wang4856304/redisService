package com.wj;

import com.wj.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jun.wang
 * @title: RedisServiceTest
 * @projectName ownerpro
 * @description: TODO
 * @date 2019/5/7 13:46
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisServiceApp.class)
public class RedisServiceTest {


    @Autowired
    private RedisService redisService;


    @Test
    public void test() {
        redisService.set("name", "wangjun");
        String name = redisService.get("name");
        System.out.println(name);

        Map<String, String> map = new HashMap<>();
        map.put("name", "wangjun");
        redisService.hmset("map", map);
        Map<String, String> value = redisService.hmget("map");
        System.out.println(value);


        String key = "lock";
        String lockValue = "lock";
        boolean is = redisService.setLock(key, lockValue, 60);
        System.out.println(is);
        is = redisService.setLock(key, lockValue, 60);
        System.out.println(is);
    }
}
