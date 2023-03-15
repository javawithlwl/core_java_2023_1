package com.careerit.cbook.dao;

import com.careerit.cbook.dao.util.ConnectionUtil;
import com.careerit.cbook.domain.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao {
  private int id;

  @Override
  public Long insertContact(Contact contact) {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    long id = 0;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement("insert into contact(name,email,mobile) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
      pst.setString(1, contact.getName());
      pst.setString(2, contact.getEmail());
      pst.setString(3, contact.getMobile());
      pst.executeUpdate();
      rs = pst.getGeneratedKeys();
      if (rs.next()) {
        id = rs.getLong("id");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return id;
  }

  @Override
  public int insertContacts(List<Contact> contacts) {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int[] res=null;
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement("insert into contact(name,email,mobile) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
      for(Contact contact:contacts) {
        pst.setString(1, contact.getName());
        pst.setString(2, contact.getEmail());
        pst.setString(3, contact.getMobile());
        pst.addBatch();
      }
      res = pst.executeBatch();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return res.length;
  }

  @Override
  public Contact selectContact(long id) {
    return null;
  }

  @Override
  public List<Contact> selectAllContacts() {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    List<Contact> list = new ArrayList<>();
    try {
      con = ConnectionUtil.getConnection();
      pst = con.prepareStatement("select id,name,email,mobile,status from contact where status = false");
      rs = pst.executeQuery();
      while(rs.next()){
          int id = rs.getInt("id");
          String name = rs.getString("name");
          String email = rs.getString("email");
          String mobile = rs.getString("mobile");
          boolean status = rs.getBoolean("status");
          Contact contact = new Contact();
          contact.setCid(id);
          contact.setName(name);
          contact.setMobile(mobile);
          contact.setEmail(email);
          contact.setStatus(status);
          list.add(contact);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }

  @Override
  public List<Contact> searchContacts(String str) {
    return null;
  }

  @Override
  public Contact updateContact(Contact contact) {
    return null;
  }

  @Override
  public boolean deleteContact(long id) {
    return false;
  }

  @Override
  public int deleteAll() {
    Connection con = null;
    Statement st = null;
    int count = 0;
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      count = st.executeUpdate("delete from contact");
      System.out.println("Total " + count + " contacts are deleted");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(st, con);
    }
    return count;
  }

}
