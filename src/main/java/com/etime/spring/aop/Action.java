package com.etime.spring.aop;

import java.lang.annotation.*;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name() default "";
}
