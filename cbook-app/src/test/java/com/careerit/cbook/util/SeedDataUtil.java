package com.careerit.cbook.util;

import com.careerit.cbook.domain.Contact;

import java.util.List;

public class SeedDataUtil {
  public static Contact getContact() {
    Contact contact = new Contact();
    contact.setName("Krish");
    contact.setEmail("krish.t@gmail.com");
    contact.setMobile("9876543210");
    return contact;
  }

  public static List<Contact> getContacts() {
    Contact contact1 = new Contact();
    contact1.setName("Krish");
    contact1.setEmail("krish.t@gmail.com");
    contact1.setMobile("9876543210");

    Contact contact2 = new Contact();
    contact2.setName("Manoj");
    contact2.setEmail("manoj.pvn@gmail.com");
    contact2.setMobile("9876543219");

    Contact contact3 = new Contact();
    contact3.setName("Pavan");
    contact3.setEmail("pavan.k@gmail.com");
    contact3.setMobile("9876543239");
    return List.of(contact1, contact2, contact3);
  }
}
