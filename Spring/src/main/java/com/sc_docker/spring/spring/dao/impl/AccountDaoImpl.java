package com.sc_docker.spring.spring.dao.impl;

import com.sc_docker.spring.spring.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
