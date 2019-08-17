package com.ynding.hardwareprotocol.controller;

import com.alibaba.fastjson.JSONObject;
import com.ynding.hardwareprotocol.Dto.PersonDate;
import com.ynding.hardwareprotocol.Dto.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/get_person_list")
    public Response<PersonDate> getPersonList(@RequestBody JSONObject params){


    }
}
