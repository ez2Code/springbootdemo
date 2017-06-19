package com.ctrip.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by li_weia on 2017/6/16.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    JSONObject home() {
        JSONObject obj = new JSONObject();
        obj.put("name","Jack");
        return obj;
    }
}
