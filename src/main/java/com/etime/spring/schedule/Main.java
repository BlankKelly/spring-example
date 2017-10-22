package com.etime.spring.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
