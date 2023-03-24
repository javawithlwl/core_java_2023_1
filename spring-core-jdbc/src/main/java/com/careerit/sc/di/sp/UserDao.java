package com.careerit.sc.di.sp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Repository
@Scope("prototype")
public class UserDao {
    private LocalDateTime time = LocalDateTime.now();
    public void showDate(){
      System.out.println(time);
    }
}
