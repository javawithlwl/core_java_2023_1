package com.careerit.sc.di.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.sc.di.scopes")
public class Manager {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    AccountService service1 = context.getBean("accountService",AccountService.class);
    System.out.println(service1);
    System.out.println(service1.getAccountDao());
    System.out.println(service1.getAccountDao());
    System.out.println(service1.getAccountDao());

  }
}
