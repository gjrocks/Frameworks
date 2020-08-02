package com.gj.concurrencies;

public class SharedResource {

	
	private Integer data;

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public SharedResource(Integer data) {
		super();
		this.data = data;
	}
	
	public SharedResource() {
		super();
		
	}
	
	public void defaultOperation() {
		data++;
	}
	
}
