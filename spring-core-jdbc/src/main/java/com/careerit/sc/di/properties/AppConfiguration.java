package com.careerit.sc.di.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfiguration {
      @Autowired
      private Environment env;

      public void showValues(){
        System.out.println(env.getProperty("db.pg.username"));
      }
}
