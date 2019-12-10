package com.springxml.service.impl;

import com.springxml.dao.IAccountDao;
import com.springxml.domain.Account;
import com.springxml.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

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
