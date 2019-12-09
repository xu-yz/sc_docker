package com.sc_docker.spring.base.dao.dao;

import com.sc_docker.spring.base.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
