package com.careeit.cbookserverapp.service;

import com.careeit.cbookserverapp.domain.Contact;
import com.careeit.cbookserverapp.repo.ContactRepo;
import com.careeit.cbookserverapp.service.exception.ContactAlreadyExistsException;
import com.careeit.cbookserverapp.service.exception.ContactNotFoundException;
import com.careeit.cbookserverapp.util.ErrorCodes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ContactServiceImpl implements ContactService {

  @Autowired
  private ContactRepo contactRepo;

  @Override
  public long addContact(Contact contact) {
    Assert.notNull(contact, "Contact object can not be null");
    String mobile = contact.getMobile();
    Assert.notNull(mobile, "Contact mobile can not be null");

    Optional<Contact> optContact = contactRepo.findByMobile(mobile);
    if (optContact.isPresent()) {
      throw new ContactAlreadyExistsException("Contact already exists with given mobile number :" + mobile,
          ErrorCodes.DUPLICATE_CONTACT
      );
    }
    contact = contactRepo.save(contact);
    long id = contact.getId();
    log.info("Contact is added with id {}", id);
    return id;
  }

  @Override
  public List<Contact> getContacts() {
    List<Contact> list = contactRepo.findAll();
    log.info("Total contact count : {}", list.size());
    return list;
  }

  @Override
  public List<Contact> search(String str) {
    List<Contact> list = contactRepo.findByNameOrMobile(str);
    log.info("For given search str {} found {} contacts", str, list.size());
    return list;
  }

  @Override
  public Contact getContact(Long id) {
    Optional<Contact> contact = contactRepo.findById(id);
    return contact.orElseThrow(() -> {
      throw new ContactNotFoundException("Contact is not found with given id :" + id, ErrorCodes.NOT_FOUND);
    });
  }

  @Override
  public Contact updateContact(Contact contact) {
    Assert.notNull(contact, "Contact object can not be null");
    String mobile = contact.getMobile();
    Assert.notNull(mobile, "Contact mobile can not be null");
    Assert.notNull(contact.getId(), "Contact id can't be null when update operation requested");
    Optional<Contact> optContact = contactRepo.findByMobile(mobile);
    if (optContact.isPresent() && optContact.get().getId() != contact.getId()) {
      log.error("Some other contact exists with given mobile number");
      throw new ContactAlreadyExistsException("Contact already exists with given mobile number :" + mobile,
          ErrorCodes.DUPLICATE_CONTACT
      );
    }
    contact = contactRepo.save(contact);
    log.info("Contact is updated successfully ");
    return contact;
  }

  @Override
  public boolean deleteContact(Long id) {
    Optional<Contact> optContact = contactRepo.findById(id);
    if(optContact.isPresent()){
        contactRepo.deleteById(id);
        log.info("Contact with id {} deleted",id);
    }
    log.error("Contact with id {} is not found ",id);
    throw new ContactNotFoundException("Contact not found with given id :"+id,ErrorCodes.NOT_FOUND);
  }
}
