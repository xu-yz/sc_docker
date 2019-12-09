package com.sc_docker.spring.iocbase.service.impl;

import com.sc_docker.spring.iocbase.factory.BeanFactory;
import com.sc_docker.spring.iocbase.service.IAccountService;
import com.sc_docker.spring.iocbase.dao.IAccountDao;

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
