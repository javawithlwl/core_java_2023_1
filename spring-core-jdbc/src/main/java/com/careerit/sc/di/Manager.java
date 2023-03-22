package com.careerit.sc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("report-bean.xml");
    ContactService service = context.getBean(ContactService.class);
    service.export(List.of(
        List.of("1001", "Krish", "35"),
        List.of("1021", "Krishna", "31"),
        List.of("1031", "Pradeep K", "33"),
        List.of("1041", "Ramesh", "32")));


  }
}
