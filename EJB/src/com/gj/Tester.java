package com.gj;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Tester {

	
	public static void main(String[] args) throws Exception{
		 Properties env = new Properties();
		 env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory" );
		 env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
		 env.put(Context.PROVIDER_URL, "jnp://127.0.0.1:1099");
	        // create a context passing these properties
	        InitialContext context;
	        Object test = null;
	        try {
	            context = new InitialContext(env);
	            System.out.println(context);
	        } catch (NamingException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            return;
	        }
	}
}
