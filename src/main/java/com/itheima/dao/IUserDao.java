package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 *  用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有的用户并且，查询出所有的账户信息
     * @return
     */
    List<User> findAll();

    /**
     * 通过用户Id来查询数据
     * @param userId
     * @return
     */
    User findById(Integer userId);

}