package com.concurrent.practise.demo.controller;


import com.concurrent.practise.demo.entity.MsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/")
public class RepeatFormController {


    @Autowired
    private RedisTemplate redisTemplate;

    public MsgVo testRepeat(){

        MsgVo msgVo  = new MsgVo();
        msgVo.setMessage("test");
        return msgVo;

    }



}
