package com.careerit.sc.di.properties;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @PreDestroy
  public void destroy() throws Exception {
    System.out.println("destroy");
  }

  @PostConstruct
  public void init() throws Exception {
    System.out.println("init");
  }
}
