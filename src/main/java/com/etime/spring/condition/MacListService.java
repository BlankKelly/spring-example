package com.etime.spring.condition;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
