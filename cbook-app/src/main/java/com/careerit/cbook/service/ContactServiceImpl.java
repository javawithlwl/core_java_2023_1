package com.careerit.cbook.service;

import com.careerit.cbook.dao.ContactDao;
import com.careerit.cbook.dao.ContactDaoImpl;
import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.CsvExporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ContactServiceImpl implements ContactService {

  private ContactDao contactDao;

  public ContactServiceImpl() {
    contactDao = new ContactDaoImpl();
  }

  @Override
  public Long addContact(Contact contact) {
    return null;
  }

  @Override
  public int addContacts(List<Contact> contacts) {
    return 0;
  }

  @Override
  public Contact getContact(long id) {
    return null;
  }

  @Override
  public List<Contact> getAllContacts() {
    return null;
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
  public boolean removeContact(long id) {
    return false;
  }

  @Override
  public int removeAllContact() {
    return 0;
  }

  @Override
  public String export() {
    List<Contact> contacts = contactDao.selectAllContacts();
    String[] headings = new String[]{"Id", "Name", "Email", "Mobile", "Status"};
    String[] headingKeys = new String[]{"cid", "name", "email", "mobile", "status"};
    String tempPath = System.getProperty("java.io.tmpdir") + System.currentTimeMillis() + "_contact.csv";
    CsvExporter csvExporter = new CsvExporter(tempPath, headings, headingKeys);
    ObjectMapper objectMapper = new ObjectMapper();
    for (Contact contact : contacts) {
      System.out.println(contact);
      TypeReference<Map<String,Object>> type = new TypeReference<Map<String, Object>>() {};
      Map<String, Object> map = objectMapper.convertValue(contact, type);
      csvExporter.writeMap(map);
    }
    csvExporter.close();
    return tempPath;

  }

  @Override
  public String archive() {
    return null;
  }
}
