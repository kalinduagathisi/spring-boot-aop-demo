package com.kalicoder.springaopdemo.dao.impl;

import com.kalicoder.springaopdemo.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Override
    public void addAccount() {
        System.out.println(getClass() + "DB work: Adding account!");
    }
}
