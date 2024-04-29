package com.harendra.autowire.autonnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.harendra.autowire.xml.Address;

public class Student {
	
	private Address address;
	
//	public Student(Address address) {
//		this.address = address;
//		System.out.print("controctor01");
//	}

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.print("setter :");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	

}
