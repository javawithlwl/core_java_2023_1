package com.careerit.sc.di.pms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Repository
public class ProductDaoImpl implements ProductDao {

  @Autowired
  private ConnectionService connectionService;

  @Override
  public List<Product> selectProducts() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<Product> list = new ArrayList<>();
    try {
      con = connectionService.getConnection();
      st = con.createStatement();
      rs = st.executeQuery("select id,name,price from product");
      while (rs.next()) {
        Product p = new Product();
        p.setId(rs.getLong("id"));
        p.setName(rs.getString("name"));
        p.setPrice(rs.getDouble("price"));
        list.add(p);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      connectionService.close(rs,st,con);
    }
    return list;
  }
}
