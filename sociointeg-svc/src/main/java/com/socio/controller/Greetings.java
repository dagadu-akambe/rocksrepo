package com.socio.controller;

public class Greetings {

	private String name;
	private String id;
	private String address;
	
	public Greetings(String name, String id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
