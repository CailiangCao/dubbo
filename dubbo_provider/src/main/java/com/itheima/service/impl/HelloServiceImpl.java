package com.itheima.service.impl;

import com.itheima.service.HelloService;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/3 19:09
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello...");
    }
}
