package com.careerit.sc.di.javaconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
public class BirthdayGreetings implements  GreetingService{

  @Value("${greetings.message:Wish you happy birthday}")
  private String message;
  @Override
  public String greetings() {
    return message;
  }
}
