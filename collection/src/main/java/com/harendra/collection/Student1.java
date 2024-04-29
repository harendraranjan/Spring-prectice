package com.harendra.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student1 {
	private String name;
	private List<String> Address; 
	private Set<String> phone;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", Address=" + Address + ", phone=" + phone + ", courses=" + courses + "]";
	}
	


}
