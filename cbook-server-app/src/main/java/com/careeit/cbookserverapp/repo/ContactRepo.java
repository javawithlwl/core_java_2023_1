package com.careeit.cbookserverapp.repo;

import com.careeit.cbookserverapp.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contact, Long> {
  Optional<Contact> findByMobile(String mobile);

  @Query("select c from Contact c where lower(c.fullName) like %:str% or c.mobile like %:str%")
  List<Contact> findByNameOrMobile(@Param("str") String str);
}
