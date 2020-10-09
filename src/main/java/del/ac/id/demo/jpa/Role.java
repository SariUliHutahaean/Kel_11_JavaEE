package del.ac.id.demo.jpa;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table; 


@Entity
@Table (name = "t_role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="roleid")
	private int roleid; 
	
	@Column(name="roledesc")  
	private String roledesc;  
	
	protected Role() {}  
	public Role(int roleid, String roledesc) {   
		this.roleid = roleid;   
		this.roledesc = roledesc;  
		}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRoledesc() {
		return roledesc;
	}
	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}
	
	
	

}
