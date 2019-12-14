package com.concurrent.practise.demo.Distribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class DFistributeLock {

    @Autowired
    private RedisTemplate redisTemplate;

    private static int expireTime = 5*60;

    public static Boolean acruireKey(){

     return true;
    }



}
