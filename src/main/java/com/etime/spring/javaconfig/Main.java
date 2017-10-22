package com.etime.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("java config!"));

        context.close();
    }
}
