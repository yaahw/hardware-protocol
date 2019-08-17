package com.ynding.hardwareprotocol.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ynding.hardwareprotocol.Dto.RegisterData;
import com.ynding.hardwareprotocol.Dto.Response;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/connect")
public class ConnectController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @PostMapping(value = "/register")
    @ApiOperation(value = "注册",produces = "text/json;charset=UTF-8")
    public void register(HttpServletResponse response, @RequestBody JSONObject params){
        log.info(JSON.toJSONString(params));

        response.reset();
        response.setContentType("text/json;charset=UTF-8");

        Response<RegisterData> registerResponse = new Response<>();
        registerResponse.setCode(1);
        registerResponse.setName("registerResponse");
        registerResponse.setTimeStamp(params.getString("TimeStamp"));
        RegisterData data = new RegisterData();
        data.setServerVersion(params.getString("HTTPVersion"));
        String session = params.getString("DeviceUUID") + "_" + params.getString("TimeStamp");
        redisTemplate.opsForValue().set("session_"+params.getString("DeviceUUID"), session);
        data.setSession(session);
        registerResponse.setData(data);
        registerResponse.setMessage("注册成功");
        log.info(JSON.toJSONString(registerResponse));
        try {
            response.getOutputStream().write(JSON.toJSONString(registerResponse).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/heartbeat")
    @ApiOperation(value = "心跳")
    public void heartbeat(@RequestBody JSONObject params){

        log.info("心跳");
    }

    @PostMapping("/capture")
    @ApiOperation(value = "抓拍")
    public void capture(@RequestBody JSONObject params){

        log.info("抓拍");
    }


}
