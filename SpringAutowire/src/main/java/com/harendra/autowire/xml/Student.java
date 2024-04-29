package com.harendra.autowire.xml;

public class Student {
	private Address address;
	
	

	public Student(Address address) {
		this.address = address;
		System.out.print("controctor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.print("setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
