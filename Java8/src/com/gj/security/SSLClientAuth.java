package com.gj.security;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;

public class SSLClientAuth {

	
	 static
	   {
	      System.setProperty("javax.net.ssl.trustStore", "c:/Apps/ssl/client.jks");
	      System.setProperty("javax.net.ssl.trustStorePassword", "clientpassword");
	      System.setProperty("javax.net.ssl.keyStore", "c:/Apps/ssl/client.jks");
	      System.setProperty("javax.net.ssl.keyStorePassword", "clientpassword");
	   }
	public static void main(String[] args) throws Exception {
		

		
		HttpClient client = new HttpClient();
	      GetMethod method = new GetMethod();
	      method.setURI(new URI("https://localhost:8443", false));
	      client.executeMethod(method);
	 
	      System.out.println(method.getResponseBodyAsString());
	}

}
