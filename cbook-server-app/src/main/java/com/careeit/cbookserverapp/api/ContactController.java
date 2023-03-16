package com.careeit.cbookserverapp.api;

import com.careeit.cbookserverapp.domain.Contact;
import com.careeit.cbookserverapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

  @Autowired
  private ContactService contactService;

  @PostMapping
  public ResponseEntity<Long> addContact(@RequestBody Contact contact) {
    Long id = contactService.addContact(contact);
    return ResponseEntity.ok(id);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Contact>> getContacts() {
    List<Contact> contactList = contactService.getContacts();
    return ResponseEntity.ok(contactList);
  }

  @GetMapping("/search")
  public ResponseEntity<List<Contact>> search(@RequestParam(required = false) String str) {
    List<Contact> contactList = contactService.search(str);
    return ResponseEntity.ok(contactList);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Contact> getContact(@PathVariable("id") Long id) {
    Contact contact = contactService.getContact(id);
    return ResponseEntity.ok(contact);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> deleteContact(@PathVariable("id") Long id) {
    boolean res = contactService.deleteContact(id);
    return ResponseEntity.ok(res);
  }

  @PutMapping
  public ResponseEntity<Contact> getContact(@RequestBody Contact contact) {
    contact = contactService.updateContact(contact);
    return ResponseEntity.ok(contact);
  }


}
