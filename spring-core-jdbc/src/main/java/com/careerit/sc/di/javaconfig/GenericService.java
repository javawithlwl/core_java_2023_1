package com.careerit.sc.di.javaconfig;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericService {

    private GreetingService greetingService;

    public void showGreetings(){
      System.out.println(greetingService.greetings());
    }
}
