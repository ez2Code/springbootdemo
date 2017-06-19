package com.ctrip.test;

import com.ctrip.api.IBusDataApi;
import com.ctrip.factory.BusApiFactory;

/**
 * Created by li_weia on 2017/6/9.
 */
public class BusFatoryTest {
    public static void main(String[] args){
        IBusDataApi api;
        api = BusApiFactory.getSupplierApi("www.shanghai.com");
        api.getAllLine();
        api = BusApiFactory.getSupplierApi("www.sichuan.com");
        api.getAllLine();
        api = BusApiFactory.getSupplierApi("www.zxc.com");
        api.getAllLine();
        System.out.println(api.getStationInfo());
    }
}
