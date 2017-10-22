package com.etime.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huitailang on 2017/10/22.
 *@author huitailang
 */
@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;

    public String sayHello(String message){
        return functionService.sayHello(message);
    }
}
