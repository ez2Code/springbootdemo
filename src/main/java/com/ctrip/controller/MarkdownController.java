package com.ctrip.controller;

import org.markdown4j.Markdown4jProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;

/**
 * Created by li_weia on 2017/6/20.
 */
@Controller
public class MarkdownController {

    private final static String path = "E:/";
    @RequestMapping("/markdown/{file}")
    @ResponseBody
    String getAllLine(@PathVariable("file") String file){
        String filePath = path + file +".md";
        File fileObj = new File(filePath);
        StringBuilder sb = new StringBuilder();
        if(fileObj.isFile() && fileObj.exists()) {
            InputStreamReader read = null;
            try {
                read = new InputStreamReader(
                        new FileInputStream(fileObj));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            try {
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    sb.append(lineTxt);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            return "资源不存在!";
        }

        String html;
        try {
            html = new Markdown4jProcessor().process(sb.toString());
        } catch (IOException e) {
            return "文件解析失败!";
        }
        return html;
    }
    @RequestMapping("/forward")
    public String forward(){
        return "name/sda";
    }
}
