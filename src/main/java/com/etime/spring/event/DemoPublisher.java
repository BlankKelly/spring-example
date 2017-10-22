package com.etime.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String message){
        applicationContext.publishEvent(new DemoEvent(this, message));
    }
}
