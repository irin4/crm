package fr.treeptik.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.dao.EntrepriseDAO;
import fr.treeptik.entity.Contact;
import fr.treeptik.entity.Entreprise;
import fr.treeptik.service.EntrepriseService;

@Service(value="entrepriseServiceImpl")
public class EntrepriseServiceImpl implements EntrepriseService {
	
	@Autowired
	EntrepriseDAO entrepriseDao;

	@Transactional
	@Override
	public void add(Entreprise entreprise) {
		entrepriseDao.save(entreprise);
		
	}

	@Override
	public List<Entreprise> getAll() {
	
		return entrepriseDao.findAll();
	}

	@Override
	public Entreprise get(Integer id) {
		Entreprise e=entrepriseDao.findOne(id);
		return e;
	}

	@Transactional
	@Override
	public void delete(Integer entrepriseId) {
		entrepriseDao.delete(entrepriseId);
		
	}

	@Override
	public List<Contact> getListeContact(Integer entrepriseId) {
		List<Contact>listeContact= new ArrayList<Contact>();
		listeContact= entrepriseDao.getListeContact(entrepriseId);
		return listeContact;
	}

//	@Override
//	public Entreprise update(Entreprise e) {
//		// TODO Auto-generated method stub
//		return null;
//	}



}
