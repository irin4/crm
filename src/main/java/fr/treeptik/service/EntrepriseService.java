package fr.treeptik.service;

import java.util.List;

import fr.treeptik.entity.Contact;
import fr.treeptik.entity.Entreprise;

public interface EntrepriseService {
    public void add(Entreprise entreprise);
    public List<Entreprise> getAll();
    public Entreprise get(Integer id);
    public void delete(Integer entrepriseId);
    //public Entreprise update(Entreprise e);
    public List<Contact>getListeContact(Integer entrepriseId);

}
