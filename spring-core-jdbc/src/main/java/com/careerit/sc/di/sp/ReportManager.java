package com.careerit.sc.di.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@ComponentScan(basePackages = {"com.careerit.sc.di.sp"})
public class ReportManager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ReportManager.class);
    ProductService obj = context.getBean(ProductService.class);
    obj.downloadReport(LocalDate.now().minusMonths(3),LocalDate.now());
  }
}
