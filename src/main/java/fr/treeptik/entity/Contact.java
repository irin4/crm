package fr.treeptik.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String nom;
	private String prenom;
	private String mail;
	private String numeroFixe;
	private String numeroMobile;
	
	
	@Enumerated(EnumType.STRING)
	private Statut statut;
	
	@ManyToOne
	private Entreprise entreprise;
	
	@OneToMany(mappedBy="contact",fetch=FetchType.EAGER,cascade={CascadeType.ALL})
	private Collection<Echange>echanges;

	/**
	 * 
	 */
	public Contact() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumeroFixe() {
		return numeroFixe;
	}

	public void setNumeroFixe(String numeroFixe) {
		this.numeroFixe = numeroFixe;
	}

	public String getNumeroMobile() {
		return numeroMobile;
	}

	public void setNumeroMobile(String numeroMobile) {
		this.numeroMobile = numeroMobile;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Collection<Echange> getEchanges() {
		return echanges;
	}

	public void setEchanges(Collection<Echange> echanges) {
		this.echanges = echanges;
	}
	
	
	
}
