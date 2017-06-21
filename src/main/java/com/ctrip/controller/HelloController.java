package com.ctrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/16.
 */
@Controller
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
