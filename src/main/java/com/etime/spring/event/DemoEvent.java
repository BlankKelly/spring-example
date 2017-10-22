package com.etime.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class DemoEvent extends ApplicationEvent{
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
