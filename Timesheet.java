package entities;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Timesheet {

	private static final long  serialVersionUId=1L;
	
	@EmbeddedId
	private Timesheet_PK timesheet_PK;
	
	private String  isValid;
	
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToOne
	@JoinColumn(name="id_Emp" , referencedColumnName="ID_EMPL",
	          insertable=false , updatable=false)
	private Employe emp;
	
	@ManyToOne
	@JoinColumn(name="id_Miss" , referencedColumnName="ID_Miss",
	          insertable=false , updatable=false)
	private Mission miss;
}
