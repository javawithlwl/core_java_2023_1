package com.careerit.sc.di.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class ConnectionDetails {

    @Value("${db.pg.url:default_value}")
    private String url;
    @Value("${db.pg.username}")
    private String username;
    @Value("${db.pg.password}")
    private String password;



}
