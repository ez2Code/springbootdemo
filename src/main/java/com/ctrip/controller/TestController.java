package com.ctrip.controller;

import com.ctrip.service.IBusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
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

    @RequestMapping("/getAllLine")
    @ResponseBody
    String getAllLine(ModelMap modelMap, String site) {
        return busDataService.getAllLine(site);
    }
}
