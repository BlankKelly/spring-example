package com.etime.spring.javaconfig;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String message){
        return functionService.sayHello(message);
    }
}
