package com.harendra.constructor;

public class Certificate {
	private int id;
	private String Cname;
	public Certificate(int id, String Cname) {
		super();
		this.id = id;
		this.Cname = Cname;
	}
	@Override
	public String toString() {
		return "Certificate [id=" + id + ", Cname=" + Cname + "]";
	}
	
	

}
