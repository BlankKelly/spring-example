package com.etime.spring.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(ElConfig.class);
        context.refresh();

        ElConfig elConfig = context.getBean(ElConfig.class);

        elConfig.outputResource();

        context.close();
    }
}
