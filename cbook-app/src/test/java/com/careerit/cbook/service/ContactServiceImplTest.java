package com.careerit.cbook.service;

import com.careerit.cbook.dao.ContactDao;
import com.careerit.cbook.dao.ContactDaoImpl;
import com.careerit.cbook.util.SeedDataUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceImplTest {

  private ContactService contactService;
  private ContactDao contactDao;

  @BeforeEach
  public void init() {
    contactService = new ContactServiceImpl();
    contactDao = new ContactDaoImpl();
    contactDao.deleteAll();
  }

  @Test
  void exportTest() {
    contactDao.insertContacts(SeedDataUtil.getContacts());
    String path = contactService.export();
    System.out.println(path);
    Assertions.assertTrue(path.endsWith(".csv"));
  }
}
