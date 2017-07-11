package com.dxy.cntroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongx on 2017/6/10.
 */
@Controller
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;
    @Value("${content}")
    private String content;
    @RequestMapping(value = "/hello")
    public String say(Model model){
        model.addAttribute("name", "dxysun");
        return "test";
    }
    @RequestMapping(value = "/content")
    @ResponseBody
    public String index(){
        return content;
    }
}
