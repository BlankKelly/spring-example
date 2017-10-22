package com.etime.spring.bean;

import org.springframework.stereotype.Service;

/**
 * Created by huitailang on 2017/10/22.
 *
 * @author huitailang
 */
@Service
public class FunctionService {
    public String sayHello(String message){
        return "hello, " + message;
    }
}
