package com.gj;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.Random;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class SystemEventLoader {

	public static void main(String[] args) throws Exception{
	
		VelocityEngine ve = new VelocityEngine();
	      
	  	ve.init();
	  	FileWriter wt=new FileWriter(new File("resources/system_event1.sql"),true);
	  	for(int i=0;i<50000;i++){
	    VelocityContext context = new VelocityContext();
        context.put("secategory", getRandomCategory());
        context.put("setype", getRandomSEType());
        context.put("sesession", getRandomSession());
        context.put("seyear", getRandomYear());
        context.put("userid", getRandomUserID());
       

        Template t = ve.getTemplate("resources/systemEvent.vm");
        StringWriter writer = new StringWriter();
        t.merge(context, writer);
        
        String sql=writer.toString();
        wt.write(sql);
	  	}
	  	wt.close();
	  	
        System.out.println("done");

	}

	private static Object getRandomUserID() {
		
		return random(10);
	}

	private static int getRandomYear() {
		
		return 2014;
	}

	private static String getRandomSession() {
	
		return "1C6DC74A33B02A91DB9C2DD91280ECA6";
	}

	private static Object getRandomSEType() {
	
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

	private static Object getRandomCategory() {
		String a[]=new String[2];
		a[0]="APPLICATION";
		a[1]="AUTHENTICATION";
		
		return a[random(a.length)];
	}

	private static int random(int max){
		Random r = new Random();
	    int randint = Math.abs(r.nextInt()) % (max);
	    //System.out.println(randint);
	    return randint;
	}
	
	
	
}
