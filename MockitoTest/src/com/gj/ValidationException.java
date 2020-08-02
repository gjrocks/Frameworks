package com.gj;

public class ValidationException extends Exception {

	public ValidationException(String message){
		super(message);
	}
	
	public ValidationException(){
		super();
	}
}
