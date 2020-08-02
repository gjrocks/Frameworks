package com.gj.simple;

public class SwtichTest {

	public static void main(String[] args) {
		
		Status temp=Status.other;
	    	
		switch(temp){
		
		case complete:
		System.out.println(Status.complete);
		//break;
		
		
		case incomplete:
		System.out.println(Status.incomplete);
		//break;
		
		
		default:
		System.out.println("default");
		//break;
		
		}

	}

}

enum Status{

	complete("complete"), other("other"),
	incomplete("incomplete");
	
	String code;
	private Status(String e){
		code=e;
	}
	
	
}
