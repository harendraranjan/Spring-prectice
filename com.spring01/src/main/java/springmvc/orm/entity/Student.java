package springmvc.orm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="Spring_orn")
public class Student {
	@Id
	private int Id;
	private String Name;
	private String Email;
	
	public Student(int id, String name, String email) {
		Id = id;
		Name = name;
		Email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}
