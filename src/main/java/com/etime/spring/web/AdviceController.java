package com.etime.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huitailang on 2017/10/28.
 * @author huitailang
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    @ResponseBody
    public String getSomething(@ModelAttribute("msg")String msg){
        return msg;
    }
}
