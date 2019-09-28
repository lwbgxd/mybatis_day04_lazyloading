package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 *  账户持久层接口
 */
public interface IAccountDao  {

    /**
     * 查询所有的账户，并且获取账户关联的所有的用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 通过uid查询账户信息
     * @param uid
     * @return
     */
    List<Account> findByUid(Integer uid);

}
