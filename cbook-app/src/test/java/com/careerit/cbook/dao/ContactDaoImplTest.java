package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.SeedDataUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ContactDaoImplTest {

  private ContactDao contactDao;

  @BeforeEach
  public void init() {
    contactDao = new ContactDaoImpl();
    contactDao.deleteAll();
  }
  @Test
  void insertContactTest() {
    Contact contact = SeedDataUtil.getContact();
    long id = contactDao.insertContact(contact);
    Assertions.assertTrue(id > 0);
  }

  @Test
  void selectContactsTest(){
      List<Contact> contacts = SeedDataUtil.getContacts();
      contactDao.insertContacts(contacts);
      List<Contact> contactList = contactDao.selectAllContacts();
      Assertions.assertEquals(3,contactList.size());
  }

  @Test
  void searchContactsTest(){
    List<Contact> contacts = SeedDataUtil.getContacts();
    contactDao.insertContacts(contacts);
    List<Contact> contactList = contactDao.searchContacts("man");
    Assertions.assertEquals(1,contactList.size());
    Contact contact = contactList.get(0);
    Assertions.assertTrue(contact.getName().toLowerCase().contains("man"));
  }



}
