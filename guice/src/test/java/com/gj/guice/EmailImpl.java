package com.gj.guice;

public class EmailImpl implements IEmail {

public SMTPManager manager;
	@Override
	public boolean sendEmail(String from, String to, String message) {
		
		return getManager().send(from,to,message);
	}
	public SMTPManager getManager() {
		return manager;
	}
	public void setManager(SMTPManager manager) {
		this.manager = manager;
	}

	
}
