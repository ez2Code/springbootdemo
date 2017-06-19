package com.ctrip.test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by li_weia on 2017/6/7.
 */
public class CommonTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(100000);
        for(int i=0;i<100000;i++){
            list.add((int) Math.round(Math.random()*100));
        }

        Long start = System.currentTimeMillis();
        for(int i=0,len=list.size();i<100*1000;i++){
            System.out.println(list.get(i));
        }
        System.out.println(System.currentTimeMillis()-start);
    }

}
