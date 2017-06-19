package com.ctrip.api;

import java.util.List;
import java.util.Map;

/**
 * Created by li_weia on 2017/6/7.
 */
public interface IBusDataApi {
    List getBusData();
    List getSeatInfo();
    String getAllLine();
    Map<String, String> getStationInfo();
}
