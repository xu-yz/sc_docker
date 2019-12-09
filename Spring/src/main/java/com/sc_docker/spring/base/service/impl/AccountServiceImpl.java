package com.sc_docker.spring.base.service.impl;

import com.sc_docker.spring.base.factory.BeanFactory;
import com.sc_docker.spring.base.service.IAccountService;
import com.sc_docker.spring.base.dao.IAccountDao;
import com.sc_docker.spring.base.dao.impl.AccountDaoImpl;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService{

//    private IAccountDao accountDao = new AccountDaoImpl();
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    public void saveAccount(){
        accountDao.saveAccount();
    }

}
