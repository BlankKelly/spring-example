package com.etime.spring.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务：" + i);
    }
}
