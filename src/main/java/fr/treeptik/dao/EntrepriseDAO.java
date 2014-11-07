package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.entity.Contact;
import fr.treeptik.entity.Entreprise;

public interface EntrepriseDAO extends JpaRepository<Entreprise, Integer>{

	@Query("select c from Contact c join c.entreprise e where e.idEntreprise =:idEntreprise")
	List<Contact>getListeContact(@Param("idEntreprise")Integer idEntreprise);
}
