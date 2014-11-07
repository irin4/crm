package fr.treeptik.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.entity.Contact;
import fr.treeptik.entity.Echange;
import fr.treeptik.entity.Entreprise;
import fr.treeptik.entity.Statut;
import fr.treeptik.service.ContactService;
import fr.treeptik.service.EntrepriseService;

@Component(value ="contactAction")
@Scope("prototype")
@Namespace("/contact")
public class ContactAction extends ActionSupport{
//	implements ModelDriven<Contact>{
//}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Contact contact= new Contact();
	
	private Echange echange=new Echange();
	
	private Statut[]statuts=Statut.values();
	
	private List<Entreprise>listEntreprise=new ArrayList<Entreprise>();
	
	private List<Contact>contacts=new ArrayList<Contact>();
	
	private Collection<Echange>echanges=new ArrayList<Echange>();
	
	@Autowired
	private EntrepriseService serviceE;
	
	@Autowired
	private ContactService serviceC;


	
	@Action(value = "initAddContactAction" ,results = {
			@Result(name = "success", location = "/contact/addContact.jsp")})
	public String initAddContactAction(){
		listEntreprise=serviceE.getAll();
		
		return SUCCESS;
		
	}
	

	@Action(value = "addContactAction" ,results = {
	@Result(name = "success", type = "redirectAction", location = "listContactAction.action"),
	@Result(name = "input", location = "/contact/addContact.jsp") })// si présence formulaire et validation, obligatoire!!!
	public String addContactAction(){
		System.out.println("ADD CONTACT");	
		//TODO:ajout date échange
		
		//echanges.add(echange);
		//contact.setEchanges(echanges);
		serviceC.add(contact);
		
		return SUCCESS;
		
	}
	
	@Action(value = "listContactAction" ,results = {
	@Result(name = "success", location = "/contact/listContact.jsp")})
	public String listContactAction(){
		System.out.println("LIST CONTACT EN BASE");
		contacts=serviceC.getAll();
		
		return SUCCESS;
		
	}
	
	
	
	@Action(value = "deleteContactAction" ,results = {
			@Result(name = "success", type="redirectAction", location = "listContactAction.action") })
		public String deleteContact() throws Exception {
		System.out.println("REMOVE CONTACT");

			
		serviceC.delete(contact.getId());

		return "success";
	}
	
	
	@Action(value = "UpdateContactAction" ,results = {
			@Result(name = "success", location = "/contact/addContact.jsp") })
	public String updateContact() throws Exception {
		System.out.println("UPDATE CONTACT");
		contact=serviceC.get(contact.getId());
		listEntreprise=serviceE.getAll();


		return "success";
	}
	
	
	/*================  ECHANGE =================== */
	
	@Action(value = "getEchangeAction" ,results = {
	@Result(name = "success", location = "/contact/listEchangeContact.jsp")})
		public String getlistEchangeAction(){
		System.out.println("LIST ECHANGE CONTACT EN BASE");
		System.out.println(contact.getId());
		echanges=serviceC.getListeEchange(contact.getId());
		//System.out.println(echanges.size());
		return SUCCESS;
		
	}
	
	
	@Action(value = "initAddEchangeAction" ,results = {
			@Result(name = "success", location = "/contact/addEchange.jsp") })
		public String initAddEchange() throws Exception {
		contact=serviceC.get(contact.getId());
	


		return "success";
	}
	
	
	
	@Action(value = "addEchangeAction" ,results = {
			@Result(name = "success", type="chain", location = "getEchangeAction") })
		public String addEchange() throws Exception {
		System.out.println("ADD ECHANGE");
		//echanges.add(echange);
		
		contact=serviceC.get(contact.getId());
		System.out.println("SET ECHANGE TO CONTACT");
		echange.setContact(contact);
		serviceC.add(echange);
//		System.out.println("SET ECHANGE TO CONTACT");
//		contact.setEchanges(echanges);
//		serviceC.add(contact);
		

		return "success";
	}
	
	
	
	@Action(value = "deleteEchangeAction" ,results = {
			@Result(name = "success", type="chain", location = "getEchangeAction.action") })
		public String deleteEchange() throws Exception {
		System.out.println("REMOVE ECHANGE");
		serviceC.deleteEchange(echange.getIdEchange());

		return "success";
	}
	

	//TODO
	@Action(value = "updateEchangeAction" ,results = {
			@Result(name = "success",location = "/contact/addEchange.jsp") })
	public String updateEchange() throws Exception {
	System.out.println("UPDATE ECHANGE");
	contact=serviceC.get(contact.getId());
	echange=serviceC.getEchange(echange.getIdEchange());
	


	return "success";
	}
	
//	@Override
//	public Contact getModel() {
//		
//		return contact;
//	}






	public Statut[] getStatuts() {
		return statuts;
	}






	public void setStatuts(Statut[] statuts) {
		this.statuts = statuts;
	}






	public List<Entreprise> getListEntreprise() {
		return listEntreprise;
	}






	public void setListEntreprise(List<Entreprise> listEntreprise) {
		this.listEntreprise = listEntreprise;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public List<Contact> getContacts() {
		return contacts;
	}


	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}


	public Echange getEchange() {
		return echange;
	}


	public void setEchange(Echange echange) {
		this.echange = echange;
	}


	public Collection<Echange> getEchanges() {
		return echanges;
	}


	public void setEchanges(Collection<Echange> echanges) {
		this.echanges = echanges;
	}

}
