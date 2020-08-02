package com.gj;

public class MockCallerService {

	IEmail emailer;
	
	public IEmail getEmailer() {
		return emailer;
	}

	public void setEmailer(IEmail emailer) {
		this.emailer = emailer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean doCommunicate(String a, String b, String c) throws Exception{
		EmailValidator val=new EmailValidator();
		if(a==null || !val.validate(a))
		throw new ValidationException("From email id is not right");
		
		if(b==null || !val.validate(b))
		throw new ValidationException("To email id is not right");
		
		if(c==null || c.isEmpty())
			throw new ValidationException("Message is empty");
		
		
		return getEmailer().sendEmail(a, b, c);
	}
}
