package com.etime.spring.condition;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
