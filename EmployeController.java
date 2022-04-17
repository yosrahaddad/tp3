package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import entities.Employe;
import services.ServiceEmploye;



@Controller
public class EmployeController {
	
    private final  ServiceEmploye serviceEmploye;
    @Autowired
	
    public EmployeController(ServiceEmploye serviceEmploye) {
		
		this.serviceEmploye = serviceEmploye;
	}
    
    @PostMapping("/login")
	public Employe authenticate (@RequestBody Employe employe) throws Exception {
		String tempEmail = employe.getEmail();
		String tempPass = employe.getPassword();
		Employe userObj = null;
		if (tempEmail != null && tempPass != null) {
			 userObj = serviceEmploye.fetchUserByEmailAndPassword(tempEmail, tempPass);
			
		}
		if (userObj == null) {
			throw new Exception("Bad Credentials");
		}
		return userObj;
	}
    
    @GetMapping("/allEmploye")  
    private List<Employe> findAllEmploye()   
    {  
    return serviceEmploye.findAllEmploye();  
    }  
   
    
    @DeleteMapping("/delete/{id}")
    public void deletePlan(@PathVariable("id") Long id){
    	serviceEmploye.deleteEmploye(id);
        
    }


}
