package com.gj;

import java.io.StringWriter;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.UrlValidator;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import org.owasp.esapi.ESAPI;

public class CrossSiteScripting implements Runnable{

static	org.owasp.esapi.Validator [] validators=new org.owasp.esapi.Validator[10];
	static{
		for(int i=0;i<10;i++){
			validators[i]=ESAPI.validator();
		}
	}
	public static void main(String[] args) throws Exception {
		   for(int i=0;i<40;i++){
			  Thread t=new Thread(new CrossSiteScripting());
			  t.start();
		   }
		
		//new CrossSiteScripting().getReferer("JavaScript:alert(8)");
	//	new CrossSiteScripting().getReferer("https://www.google.com");
		//new CrossSiteScripting().getReferer("JavaScript:(alert(8))");
		//new CrossSiteScripting().getReferer("JavaScript:(alert(8))");
		
	}

	
	public  String getReferer(String referer) {
	//	String referer = request.getHeader("Referer");
		Object baseURI ="https://disclosure.capitarvs.co.uk/cheqs";
		if (baseURI == null)
			return referer;

		String retURL = baseURI.toString()+"/user/home.do";
		/*try {
				if (referer.startsWith(baseURI.toString())) {
					retURL = referer;
				}
		} catch (Exception e) {
		}
		System.out.println(retURL);*/
		org.owasp.esapi.Validator v= validators[random(10)];
		System.out.println(v.hashCode());
		try {
			boolean isValidURL =v.isValidInput(baseURI.toString(), referer, "URL", 2000, false);
			if (isValidURL) {
				if (referer.startsWith(baseURI.toString())) {
					retURL = referer;
				}
			}
		} catch (Exception e) {
		}
		return retURL;
	}
	
	public static boolean isValidWebServiceURI(String uri) {

		if (uri == null || uri.isEmpty())
			return false;

		UrlValidator urlValidator = new UrlValidator();
		if (urlValidator.isValid(uri)) {
			return true;
		}

		return false;
	}
	
	public void cssTest() throws Exception{
		VelocityEngine ve = new VelocityEngine();
	    ve.init();
	  	
	 
	    VelocityContext context = new VelocityContext();
        context.put("status_g", getStatusType());
        context.put("rand", random(100));
       
        Template t = ve.getTemplate("resources/url.vm");
        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        String url=writer.toString();
        //System.out.println(url);
        //String original="https://disclosure.capitarvs.co.uk/cheqs/csig/viewApps.do?orgId=&channel2=&status=$status&status=FORM_COMPLETE&awaitingApplicantPaymentValue=false&sortOrder=asc&awaitingApplicantCertificateValue=false&displaySize=50&channel=ebulk&queryOutstandingValue=false&page=14";
		//^(ht|f)tp(s?)\:\/\/[0-9a-zA-Z]([-.\w]*[0-9a-zA-Z])*(:(0-9)*)*(\/?)([a-zA-Z0-9\-\.\?\,\:\'\/\\\+=&amp;%\$#_]*)?$
		//System.out.println(original.length());
		//String safe = ESAPI.encoder().encodeForURL("<a>ganesh jadhav</a>");
	//	System.out.println(safe);
		//System.out.println(ESAPI.encoder().encodeForXMLAttribute(original));
		//System.out.println(DataValidator.isValidWebServiceURI(original));
		
                 long start=System.currentTimeMillis();
				 String userURL = url;
				 //boolean isValidURL = ESAPI.validator().isValidInput("URLContext", userURL, "URL", 2000, false);
				 getReferer(userURL);
				 long end=System.currentTimeMillis();
				 System.out.println("Time taken :" +(end-start));
		//		 if (isValidURL) {  
			//	System.out.println(ESAPI.encoder().encodeForHTMLAttribute(userURL));
			//	 }
	    
	}
	
	public  String getStatusType()
	{
		String a[]=new String[11];	
		a[0]="ASSWORD_SUCCESS";
		a[1]="VIEW";
		a[2]="UPDATE_ID";
		a[3]="UPDATE_SECTIONY";
		a[4]="APP_APPROVE";
		a[5]="CSIG_AUTH";
		a[6]="PASSWORD_FAILED";
		a[7]="UPDATE";
		a[8]="CSIG_AUTH_REMOVED";
		a[9]="VIEW_DISCLOSURE";
		a[10]="DOWNLOAD_DISCLOSURE";
		
		return a[random(a.length)];
	}
	
	private static int random(int max){
		Random r = new Random();
	    int randint = Math.abs(r.nextInt()) % (max);
	    //System.out.println(randint);
	    return randint;
	}




	@Override
	public void run() {
	try{
	
		//for(int i=0;i<15;i++){
		cssTest();
		//}
	}catch(Exception t){
		
	}
	}
	
}
