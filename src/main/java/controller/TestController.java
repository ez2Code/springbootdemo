package controller;

import org.json.simple.JSONObject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by li_weia on 2017/6/16.
 */
@Controller
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    JSONObject home() {
        JSONObject obj = new JSONObject();
        obj.put("name","Rose");
        return obj;
    }
}
