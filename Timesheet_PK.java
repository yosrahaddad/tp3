package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Timesheet_PK {
	private static final long serialVersionUID=1L;
	
	private long id_Emp;
	private long id_Miss;
	private long id_Ass;

}
