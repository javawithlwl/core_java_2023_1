package com.careerit.sc.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

      @Bean
      public GenericService genericService(){
          GenericService obj =  new GenericService();
          obj.setGreetingService(greetingService());
          return obj;
      }

      @Bean
      public GreetingService greetingService(){
          BirthdayGreetings obj = new BirthdayGreetings();
          return obj;
      }
}
