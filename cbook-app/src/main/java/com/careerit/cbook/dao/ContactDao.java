package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;

import java.util.List;

public interface ContactDao {
  Long insertContact(Contact contact);

  int insertContacts(List<Contact> contacts);

  Contact selectContact(long id);

  List<Contact> selectAllContacts();

  List<Contact> searchContacts(String str);

  Contact updateContact(Contact contact);

  boolean deleteContact(long id);

  int deleteAll();
}
