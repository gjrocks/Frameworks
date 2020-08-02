package com.gj.model;

public class RoleType {

	String name;
	String type;
	
	public RoleType(){
		super();
		name="test";
		type="test";
	}
	public RoleType(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
