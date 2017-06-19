package com.ctrip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/16.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    Map home() {
        Map<String, String> result= new HashMap<>();
        result.put("name","Jack");
        return result;
    }
}
