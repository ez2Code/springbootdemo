package com.ctrip.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/16.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    Map home() {
        Map<String, String> result= new HashMap<>();
        result.put("msg","welcome to spring boot");
        return result;
    }

    @RequestMapping("/name/{name}")
    String echo(@PathVariable("name") String name) {
        return "your name is " + name;
    }
}
