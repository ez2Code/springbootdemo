package com.ctrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/16.
 */
@Controller
public class HelloController {

    private final JedisPool jedisPool;

    @Autowired
    public HelloController(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    @RequestMapping("/")
    @ResponseBody
    Map home() {
        Map<String, String> result= new HashMap<>();
        result.put("msg","welcome to spring boot");
        return result;
    }

    @RequestMapping("/name/find")
    @ResponseBody
    String findName() {
        Jedis jedis = jedisPool.getResource();
        return jedis.get("name");
    }

    @RequestMapping("/name/{name}/echo")
    @ResponseBody
    String echo(@PathVariable("name") String name) {
        return "your name is " + name;
    }
}
