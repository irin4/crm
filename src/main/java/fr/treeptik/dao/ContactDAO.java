package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.treeptik.entity.Contact;

public interface ContactDAO extends JpaRepository<Contact, Integer>{

}
