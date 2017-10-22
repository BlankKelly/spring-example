package com.etime.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
@Service
public class AnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){

    }
}
