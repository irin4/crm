package fr.treeptik.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idEntreprise;
	private String raisonSociale;
	private String adresse;
	private String secteurActivite;
	
	@OneToMany(mappedBy="entreprise",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Contact>contacts;
	
	
	
	
	
	/**
	 * 
	 */
	public Entreprise() {
	
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSecteurActivite() {
		return secteurActivite;
	}
	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}
	@Override
	public String toString() {
		return "Entreprise [idEntreprise=" + idEntreprise + ", raisonSociale="
				+ raisonSociale + ", adresse=" + adresse + ", secteurActivite="
				+ secteurActivite + "]";
	}

	
	

}
