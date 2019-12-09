package com.sc_docker.spring.base.ui;

import com.sc_docker.spring.base.dao.IAccountDao;
import com.sc_docker.spring.base.dao.impl.AccountDaoImpl;
import com.sc_docker.spring.base.factory.BeanFactory;
import com.sc_docker.spring.base.service.IAccountService;
import com.sc_docker.spring.base.service.impl.AccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
//        IAccountService as = new AccountServiceImpl();
        IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
        as.saveAccount();
    }
}
