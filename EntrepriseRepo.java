package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Departement;
import entities.Entreprise;

public interface EntrepriseRepo extends JpaRepository<Entreprise, Long> {

	
	public Entreprise findByID(String id_Ent);

	public Departement save(Departement departement);

}
