package com.JDBC_Spring_02.Model;

public class Student {
	private int Id;
	private String Email;
	private String Password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String emain) {
		Email = emain;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Emain=" + Email + ", Password=" + Password + "]";
	}
	

}
