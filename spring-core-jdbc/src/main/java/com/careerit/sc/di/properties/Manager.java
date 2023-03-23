package com.careerit.sc.di.properties;

import com.careerit.sc.di.javaconfig.GenericService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("com.careerit.sc.di.properties")
public class Manager {

  public static void main(String[] args) {

    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    System.out.println(context.getBean(ConnectionDetails.class));
    AppConfiguration obj = context.getBean(AppConfiguration.class);
    obj.showValues();
    context.close();
  }
}
