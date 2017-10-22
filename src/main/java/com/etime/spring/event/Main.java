package com.etime.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);

        publisher.publish("hello application event");

        context.close();
    }
}
