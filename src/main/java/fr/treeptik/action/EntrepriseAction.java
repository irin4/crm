package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

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
import fr.treeptik.entity.Entreprise;
import fr.treeptik.service.EntrepriseService;
import fr.treeptik.serviceImpl.EntrepriseServiceImpl;


@Component(value ="entrepriseAction")
@Scope("prototype")
@Namespace("/entreprise")
public class EntrepriseAction extends ActionSupport implements ModelDriven<Entreprise> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Entreprise entreprise=new Entreprise();
	
	private List<Entreprise>entreprises=new ArrayList<Entreprise>();
	
	private List<Contact>contacts=new ArrayList<Contact>();
	
	@Autowired
	private EntrepriseService entrepriseService;

	@Override
	public Entreprise getModel() {
		
		return entreprise ;
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	@Action(value = "addEntrepriseAction" ,results = {
			@Result(name = "success", type = "redirectAction", location = "listEntrepriseAction.action"),
			@Result(name = "input", location = "/entreprise/add.jsp") })// si présence formulaire et validation, obligatoire!!!
	public String addEntreprise() throws Exception {
		System.out.println("ADD ENTREPRISE");

		System.out.println(entreprise);
		
		entrepriseService.add(entreprise);

		return "success";
	}
	
	@Action(value = "listEntrepriseAction" ,results = {
			@Result(name = "success", location = "/entreprise/list.jsp")})// si présence formulaire et validation, obligatoire!!!
	public String listEntreprise() throws Exception {
		System.out.println("LIST ENTREPRISE");
		entreprises= entrepriseService.getAll();
		System.out.println(entrepriseService.getAll().size());
		
	

		return "success";
	}
	
	@Action(value = "deleteEntrepriseAction" ,results = {
			@Result(name = "success", type="redirectAction", location = "listEntrepriseAction.action") })
		public String deleteEntreprise() throws Exception {
		System.out.println("REMOVE ENTREPRISE");

			
		entrepriseService.delete(entreprise.getIdEntreprise());//ou juste (getId)

		return "success";
	}
	
	@Action(value = "UpdateEntrepriseAction" ,results = {
			@Result(name = "success", location = "/entreprise/add.jsp") })
	public String updateEmployee() throws Exception {
		System.out.println("UPDATE ENTREPRISE");
		entreprise=entrepriseService.get(entreprise.getIdEntreprise());


		return "success";
	}
	
	@Action(value = "getContactAction" ,results = {
			@Result(name = "success", location = "/entreprise/listContactEntreprise.jsp") })
	public String getContact() throws Exception {
		System.out.println("RETRIEVE CONTACTS");
		contacts = entrepriseService.getListeContact(entreprise.getIdEntreprise());


		return "success";
	}
	

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	

}
