package com.sc_docker.spring.spring_xml.dao;

import com.sc_docker.spring.spring_xml.domain.Account;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 根据Id查询
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 新增
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);
}
