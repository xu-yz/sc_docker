package com.springannoioc.service.impl;

import com.springxml.dao.IAccountDao;
import com.springxml.domain.Account;
import com.springxml.service.IAccountService;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = null;

    public void setAccountDao(IAccountDao accountDao) {
         this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccoundById(Integer accountId) {
        return accountDao.findAccoundById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
