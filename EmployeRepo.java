package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Employe;

public interface EmployeRepo extends JpaRepository<Employe, Long> {

	
	public Employe findByEmail(String email);

	public Employe findByEmailAndPassword(String email, String password);

	public void deleteEmployeById(Long id);
}
