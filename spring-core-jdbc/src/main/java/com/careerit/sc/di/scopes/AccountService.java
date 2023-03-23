package com.careerit.sc.di.scopes;

import jakarta.inject.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AccountService {

  // Constructor
  // Setter
  // Field

  private final Provider<AccountDao> accountDao;

  @Autowired
  public AccountService(Provider<AccountDao> accountDao) {
    this.accountDao = accountDao;
  }

  public AccountDao getAccountDao() {
     return accountDao.get();
  }
}
