//package com.spring.test.springxml;
//
//
//import com.sc_docker.spring.springxml.domain.Account;
//import com.sc_docker.spring.springxml.service.IAccountService;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.List;
//
///**
// * 使用Junit单元测试，测试我们的配置
// */
//public class TestSpringXml {
//    @Test
//    public void testFindAll() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService = context.getBean("accountService",IAccountService.class);
//        List<Account> accounts = accountService.findAllAccount();
//        for (Account account : accounts){
//            System.out.println(account);
//        }
//    }
//
//    @Test
//    public void testFindOne() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService = context.getBean("accountService",IAccountService.class);
//        Account account = accountService.findAccountById(1);
//        System.out.println(account);
//    }
//
//    @Test
//    public void testSave() {
//        Account account = new Account();
//        account.setId(6);
//        account.setName("fff");
//        account.setMoney(10f);
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService = context.getBean("accountService",IAccountService.class);
//        accountService.saveAccount(account);
//    }
//
//    @Test
//    public void testUpdate() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService = context.getBean("accountService",IAccountService.class);
//        Account account = accountService.findAccountById(6);
//        account.setMoney(10000f);
//        accountService.updateAccount(account);
//    }
//
//    @Test
//    public void testDelete() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService accountService = context.getBean("accountService",IAccountService.class);
//        accountService.deleteAccount(6);
//    }
//}
