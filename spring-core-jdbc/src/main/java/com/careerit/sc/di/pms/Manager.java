package com.careerit.sc.di.pms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.sc.di.pms")
public class Manager {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Manager.class);
    ProductController productController = applicationContext.getBean(ProductController.class);
    productController.getProducts().forEach(ele->{
      System.out.println(ele);
    });

  }
}
