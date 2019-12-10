package com.spring.test;


import com.config.SpringConfiguration;
import com.spring.domain.Account;
import com.spring.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试，测试我们的配置
 */
public class TestAnnotation {
    @Test
    public void testFindAll() {
//        1.获取容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        2.得到业务层对象
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
//        3.执行方法
        List<Account> accounts = accountService.findAllAccount();
        for (Account ac : accounts){
            System.out.println(ac);
        }
    }

    @Test
    public void testFindOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
        Account account = accountService.findAccoundById(1);
        System.out.println(account);
    }

    @Test
    public void testSave(){
        Account account = new Account();
        account.setId(4);
        account.setName("ddd");
        account.setMoney(10000);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
        accountService.saveAccount(account);
    }

    @Test
    public void testUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
        Account account = accountService.findAccoundById(5);
        account.setName("ddd");
        account.setMoney(10000f);
        accountService.updateAccount(account);
    }

    @Test
    public void testDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
        accountService.deleteAccount(5);
    }
}
