package com.etime.spring.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
@Configuration
@ComponentScan("com.etime.spring.schedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
