package com.careerit.sc.di.sp;

import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.TimeUnit;

@ComponentScan(basePackages = {"com.careerit.sc.di.sp"})
public class Manager {
  @SneakyThrows
  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);

    UserService userService = context.getBean(UserService.class);
    userService.getUserDao().showDate();
    TimeUnit.SECONDS.sleep(2);
    userService.getUserDao().showDate();
    TimeUnit.SECONDS.sleep(5);
    userService.getUserDao().showDate();

  }
}
