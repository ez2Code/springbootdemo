package com.ctrip.service.impl;


import com.ctrip.api.IBusDataApi;
import com.ctrip.factory.BusApiFactory;
import com.ctrip.service.IBusDataService;
import org.springframework.stereotype.Service;

/**
 * Created by li_weia on 2017/6/19.
 */

@Service
public class BusDataServiceImpl implements IBusDataService {
    public String getAllLine(String site){
        IBusDataApi busDataApi = BusApiFactory.getSupplierApi(site);
        if(busDataApi == null){
            return "未找到供应商!";
        }
        return busDataApi.getAllLine();
    }
}
