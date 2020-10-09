package del.ac.id.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="username")
	private String username;
	@Column(name="full_name")
	private String full_name;
	@Column(name="password")
	private String password;
	@Column(name="roleid")
	private int roleid;
	
	public User() {}
	public User(String username,String full_name, String password,int roleid) {
		this.username= username;
		this.full_name=full_name;
		this.password=password;
		this.roleid=roleid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	
	

}
