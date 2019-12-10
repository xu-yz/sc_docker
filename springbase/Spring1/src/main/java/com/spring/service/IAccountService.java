package com.spring.service;



import com.spring.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List <Account> findAllAccount();

    /**
     * 根据Id查询
     * @return
     */
    Account findAccoundById(Integer accountId);

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
