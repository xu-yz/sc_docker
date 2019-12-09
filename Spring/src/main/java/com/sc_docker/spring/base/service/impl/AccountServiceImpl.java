package com.sc_docker.spring.factory.service.impl;

import com.sc_docker.spring.factory.service.IAccountService;
import com.sc_docker.spring.factory.dao.IAccountDao;
import com.sc_docker.spring.factory.dao.dao.AccountDaoImpl;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService{

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount(){
        accountDao.saveAccount();
    }

}
