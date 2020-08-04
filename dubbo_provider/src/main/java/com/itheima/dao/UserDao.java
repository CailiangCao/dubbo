package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/3 11:05
 */
public interface UserDao {

    User findById(@Param("id")Integer id);
}
