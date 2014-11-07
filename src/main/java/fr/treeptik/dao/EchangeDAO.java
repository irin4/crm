package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.entity.Echange;

public interface EchangeDAO extends JpaRepository<Echange, Integer> {
	
	@Query("select e from Echange e where e.contact.id=:contactId")
	List<Echange> getListeEchange(@Param("contactId")Integer contactId);

}
