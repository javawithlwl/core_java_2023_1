package com.careerit.sc.di.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("com.careerit.sc.di.javaconfig")
public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    GenericService genericService = context.getBean(GenericService.class);
    genericService.showGreetings();
    Arrays.stream(context.getBeanDefinitionNames()).forEach(ele->{
      System.out.println(ele);
    });
  }
}
