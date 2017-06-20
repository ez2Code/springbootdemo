package com.ctrip.controller;

import com.ctrip.service.IBusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by li_weia on 2017/6/16.
 */
@RestController
public class TestController {

    private final IBusDataService busDataService;

    @Autowired
    public TestController(IBusDataService busDataService){
        this.busDataService = busDataService;
    }

    @RequestMapping("/getAllLine/{site}")
    @ResponseBody
    String getAllLine(@PathVariable("site") String site) {
        return busDataService.getAllLine(site);
    }
}
