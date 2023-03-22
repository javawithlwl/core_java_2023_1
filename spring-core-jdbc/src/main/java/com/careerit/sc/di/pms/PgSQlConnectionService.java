package com.careerit.sc.di.pms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class PgSQlConnectionService implements  ConnectionService{

  @Value("${db.pg.username}")
  private String username;
  @Value("${db.pg.url}")
  private String url;
  @Value("${db.pg.password}")
  private String password;
  @Override
  public Connection getConnection() {
      Connection con = null;
      try{
        con = DriverManager.getConnection(url,username,password);
      }catch (SQLException e){
        e.printStackTrace();
      }
      return con;
  }

  @Override
  public void close(Statement st, Connection con) {
      try{
        if(st!=null){
          st.close();
        }
        if(con!=null){
          con.close();
        }
      }catch (SQLException e){
        e.printStackTrace();
      }
  }

  @Override
  public void close(ResultSet rs, Statement st, Connection con) {
    try{
      if(st!=null){
        st.close();
      }
      if(con!=null){
        con.close();
      }
      if(rs!=null){
        rs.close();
      }
    }catch (SQLException e){
      e.printStackTrace();
    }
  }
}
