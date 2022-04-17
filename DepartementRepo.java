package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Departement;



public interface DepartementRepo extends JpaRepository<Departement, Long> {

}
