package com.ctrip.api.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/7.
 */
public class BusNLXianyangApi extends AbstractNLCommApi {
    private static final String city = "xianyang";
    private static final String site = "www.xianyang.com";
    private static final Map<String,String> stationInfo;
    static {
        stationInfo = new HashMap<String, String>();
        stationInfo.put("serviceUrl_1","http://10.13.129.10:9001/");
        stationInfo.put("serviceUrl_2","http://10.13.129.10:9000/");
    }
    public BusNLXianyangApi() {
        super(city, site, stationInfo);
    }
}
