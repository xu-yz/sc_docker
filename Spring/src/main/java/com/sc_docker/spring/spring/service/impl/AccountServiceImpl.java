package com.sc_docker.spring.spring.service.impl;

import com.sc_docker.spring.spring.dao.IAccountDao;
import com.sc_docker.spring.spring.dao.impl.AccountDaoImpl;
import com.sc_docker.spring.spring.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount(){
        accountDao.saveAccount();
    }

}
