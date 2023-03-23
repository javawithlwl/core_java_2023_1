package com.careerit.sc.di.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
@Scope("prototype")
public class AccountDao {

    public void showTime(){
      System.out.println("Local "+ LocalDate.now());
    }
}
