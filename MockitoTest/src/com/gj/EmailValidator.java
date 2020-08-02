package com.gj;

public class EmailValidator {

	public static void main(String[] args) {
	

	}

	public boolean validate(String email){
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	     return email.matches(EMAIL_REGEX);
	}
}
