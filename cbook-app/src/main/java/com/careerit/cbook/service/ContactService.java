package com.careerit.cbook.service;

import com.careerit.cbook.domain.Contact;

import java.util.List;

public interface ContactService {

  Long addContact(Contact contact);

  int addContacts(List<Contact> contacts);

  Contact getContact(long id);

  List<Contact> getAllContacts();

  List<Contact> searchContacts(String str);

  Contact updateContact(Contact contact);

  boolean removeContact(long id);

  int removeAllContact();

  String export();

  String archive();
}
