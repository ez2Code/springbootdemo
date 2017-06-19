package com.ctrip.api.impl;

import com.ctrip.api.IBusDataApi;

import java.util.List;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/7.
 */
public abstract class AbstractNLCommApi implements IBusDataApi {
    private String city;
    private String site;
    private Map<String, String> stationInfo;

    AbstractNLCommApi(String city, String site, Map<String,String> stationInfo){
        this.city = city;
        this.site = site;
        this.stationInfo = stationInfo;
    }

    public List getBusData() {
        return null;
    }

    public List getSeatInfo() {
        return null;
    }

    public String getAllLine() {
        return "purchase site is " + site + "\n" + city + " all line...";
    }

    public Map<String, String> getStationInfo() {
        return stationInfo;
    }

    public void setStationInfo(Map<String, String> stationInfo) {
        this.stationInfo = stationInfo;
    }
}
