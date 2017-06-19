package com.ctrip.factory;

import com.ctrip.api.IBusDataApi;
import com.ctrip.api.impl.BusNLXianyangApi;
import com.ctrip.api.impl.BusShanghaiApi;
import com.ctrip.api.impl.BusSichuanApi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/7.
 */
public class BusApiFactory {
    private static Map<String,Class> vendorInfo;

    static{
        vendorInfo = new HashMap<String, Class>();
        vendorInfo.put("www.sichuan.com",BusSichuanApi.class);
        vendorInfo.put("www.shanghai.com", BusShanghaiApi.class);
        vendorInfo.put("www.xianyang.com", BusNLXianyangApi.class);
    }

    public static IBusDataApi getSupplierApi(String supplierSite) {
        IBusDataApi api = null;
        if (vendorInfo.containsKey(supplierSite)) {
            try {
                api = (IBusDataApi) vendorInfo.get(supplierSite).newInstance();
            } catch (IllegalAccessException|InstantiationException e) {
                e.printStackTrace();
            }
        }
        return api;
    }
}
