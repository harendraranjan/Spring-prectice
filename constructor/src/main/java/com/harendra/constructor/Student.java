package com.harendra.constructor;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String address;
	private List<String> PhNo;
	private Certificate certificate;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public Student(int id, String name, String address, List<String> phNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		PhNo = phNo;
	}
	public Student(int id, String name, String address, List<String> phNo, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		PhNo = phNo;
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", PhNo=" + PhNo + ", certificate="
				+ certificate + "]";
	}
	
	
	

}
