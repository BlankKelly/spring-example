package com.etime.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 * 采用AspectJ
 */
@Configuration
@ComponentScan("com.etime.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
