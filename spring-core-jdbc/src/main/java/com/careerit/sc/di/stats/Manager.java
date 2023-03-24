package com.careerit.sc.di.stats;

import com.careerit.sc.di.stats.service.IplStatService;
import com.careerit.sc.di.stats.service.IplStatServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.sc.di.stats")
public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    IplStatService service = context.getBean(IplStatServiceImpl.class);


  }
}
