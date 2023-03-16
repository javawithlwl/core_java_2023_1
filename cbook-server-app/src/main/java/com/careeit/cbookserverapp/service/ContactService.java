package com.careeit.cbookserverapp.service;

import com.careeit.cbookserverapp.domain.Contact;

import java.util.List;


public interface ContactService {

      long addContact(Contact contact);
      List<Contact> getContacts();
      List<Contact> search(String str);
      Contact getContact(Long id);
      Contact updateContact(Contact contact);
      boolean deleteContact(Long id);


}
