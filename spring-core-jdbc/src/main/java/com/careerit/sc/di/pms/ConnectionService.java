package com.careerit.sc.di.pms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public interface ConnectionService {

    Connection getConnection();
    void close(Statement st,Connection con);
    void close(ResultSet rs,Statement st,Connection con);

}
