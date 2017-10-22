package com.etime.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        AnnotationService annotationService =
                context.getBean(AnnotationService.class);
        MethodService methodService =
                context.getBean(MethodService.class);

        annotationService.add();

        methodService.add();

        context.close();
    }
}
