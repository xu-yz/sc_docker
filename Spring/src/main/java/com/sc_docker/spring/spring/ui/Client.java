package com.sc_docker.spring.spring.ui;

import com.sc_docker.spring.spring.dao.IAccountDao;
import com.sc_docker.spring.spring.service.IAccountService;
import com.sc_docker.spring.spring.service.impl.AccountServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * 获取Spring的核心容器，根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
//        1.获取核心容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        2.根据id获取Bean对象
        IAccountService as = (IAccountService) context.getBean("accountService");
        IAccountDao adao = context.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
//        as.saveAccount();
    }
}
