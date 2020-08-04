package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/3 14:11
 */
@Controller
@ResponseBody

@RequestMapping("/user")
public class UserController {
    // @Autowired
    @Reference(loadbalance = "roundrobin")
    UserService userService;

    @RequestMapping("/findById")
    public User test(Integer id) {
        User user = userService.findById(id);

        return user;
    }
}
