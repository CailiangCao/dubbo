package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/3 11:06
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findById(Integer id) {
        try {
            //return null;
            Thread.sleep(3000);
            return userDao.findById(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
