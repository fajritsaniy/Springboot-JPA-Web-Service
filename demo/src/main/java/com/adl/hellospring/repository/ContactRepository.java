package com.adl.hellospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adl.hellospring.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
