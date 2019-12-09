package com.sc_docker.spring.iocbase.ui;

import com.sc_docker.spring.iocbase.factory.BeanFactory;
import com.sc_docker.spring.iocbase.service.IAccountService;

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
