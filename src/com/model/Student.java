package com.model;

public class Student {
	private String name;
	private Contactdetail[] contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contactdetail[] getContacts() {
		return contacts;
	}

	public void setContacts(Contactdetail[] contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		
		return "Name:"+name+"  "+"Contactno:"+" "+contacts;
	}

}
