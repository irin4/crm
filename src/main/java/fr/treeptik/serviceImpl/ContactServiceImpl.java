package fr.treeptik.serviceImpl;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.dao.ContactDAO;
import fr.treeptik.dao.EchangeDAO;
import fr.treeptik.entity.Contact;
import fr.treeptik.entity.Echange;
import fr.treeptik.service.ContactService;

@Service(value="contactServiceImpl")
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactDAO contactDao;
	
	@Autowired
	EchangeDAO echangeDAO;


	@Transactional
	@Override
	public void add(Contact contact) {
		contactDao.save(contact);
		
	}

	@Override
	public Contact get(Integer id) {
		Contact contact = contactDao.findOne(id);
		return contact;
	}

	@Override
	public List<Contact> getAll() {
		
		return contactDao.findAll();
	}

	@Transactional
	@Override
	public void delete(Integer idContact) {
		contactDao.delete(idContact);
		
	}

	@Override
	public List<Contact> getListeContact(Integer entrepriseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Echange> getListeEchange(Integer contactId) {
		
		Collection<Echange>liste= echangeDAO.getListeEchange(contactId); 
		return liste;
	}
	
	@Transactional
	public void add(Echange e){
		 echangeDAO.save(e);
		
	}
	
	@Transactional
	@Override
	public void deleteEchange(Integer id) {
		echangeDAO.delete(id);
		
	}

	@Override
	public Echange getEchange(Integer id) {
		Echange e=echangeDAO.findOne(id);
		return e;
	}

//	@Override
//	public Entreprise update(Entreprise e) {
//		// TODO Auto-generated method stub
//		return null;
//	}



}
