package com.careerit.iplstats.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil {

  private static final Properties properties;

  static {
    properties = new Properties();
    try {
      properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private ConnectionUtil() {

  }

  public static Connection getConnection() {
    Connection con = null;
    try {
      String url = properties.getProperty("jdbc.url");
      String username = properties.getProperty("jdbc.username");
      String password = properties.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;
  }

  public static void close(ResultSet rs, Statement st, Connection con) {
    try {
      if (rs != null) {
        rs.close();
      }
      if (st != null) {
        st.close();
      }
      if (con != null) {
        con.close();
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public static void close(Statement st, Connection con) {
      close(null,st,con);
  }
}
