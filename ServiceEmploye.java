package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Employe;
import repositories.EmployeRepo;
import repositories.EntrepriseRepo;


@Service
@Transactional
public class ServiceEmploye {
	
	 @Autowired
	    private  EmployeRepo employeRepo ;
	    
	   
	    public ServiceEmploye(EntrepriseRepo entrepriseRepo) {
	        this.employeRepo = employeRepo;
	    }

	    public Employe fetchUserByEmailAndPassword(String email,String password) {
	    	
		return employeRepo.findByEmailAndPassword(email,password);
	}
	    
	    public List<Employe> findAllEmploye(){
	        return employeRepo.findAll();
	    }
	    
	    public void deleteEmploye(Long id){
	    	employeRepo.deleteEmployeById(id);
	    }

		
}
