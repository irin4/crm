package fr.treeptik.service;

import java.util.Collection;
import java.util.List;

import fr.treeptik.entity.Contact;
import fr.treeptik.entity.Echange;

public interface ContactService {

    public void add(Contact contact);
    public List<Contact> getAll();
    public Contact get(Integer id);
    public void delete(Integer idContact);
    //public Entreprise update(Entreprise e);
    public List<Contact>getListeContact(Integer entrepriseId);
    public Collection<Echange>getListeEchange(Integer contactId);
    public void add(Echange e);
    public void deleteEchange(Integer idEchange);
    public Echange getEchange(Integer id);
}
