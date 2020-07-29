package com.gj;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;


import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;



public class VelocityCodeGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		  VelocityEngine ve = new VelocityEngine();
	      
		  	ve.init();
	     //   List<HashMap<String,String>> tt= DomTester.getServices();
	       
	        Generator.generate();
	    String reportName= Generator.getRep().getProperty("ReportName");
	    String targetCodePackage=Generator.getRep().getProperty("targetCodePackage");
	    Map<String,String> omp=Generator.getOriginalcodeGenMap();
	 Map<String,String> mp= Generator.getCodeGenMap();
	        VelocityContext context = new VelocityContext();
	        context.put("op", mp);
	        context.put("opClass", reportName+"ReportData");
	        context.put("opCl", new Util());
	        context.put("targetCodePackage", targetCodePackage);
	        context.put("Name", new VelocityCodeGenerator());

	        Template t = ve.getTemplate("resources/ejbjar.vm");
	        StringWriter writer = new StringWriter();
	        FileWriter wt=new FileWriter(new File("resources/"+reportName+"ReportData.java"));
	        t.merge(context, writer);

	        wt.write(writer.toString());
	        wt.close();
	        StringBuilder fields=new StringBuilder();
	        int i=0;
	        int y=mp.size();
            for (Map.Entry<String,String> s : mp.entrySet()) {
            	fields.append("\""+s.getKey()+"\"");
            	if(i!=y-1)
            		fields.append(",");
            	i++;
			}
            
	        VelocityContext context1 = new VelocityContext();
	        context1.put("op", mp);
	        context1.put("opm", omp);
	        context1.put("opClass", reportName+"ReportFields");
	        context1.put("targetCodePackage", targetCodePackage);
	        
	        context1.put("opCl", new Util());
	        context1.put("fields", fields.toString());
	        context1.put("Name", new VelocityCodeGenerator());

	        Template t1 = ve.getTemplate("resources/fields.vm");
	        StringWriter writer1 = new StringWriter();
	        FileWriter wt1=new FileWriter(new File("resources/"+reportName+"ReportFields.java"));
	        t1.merge(context1, writer1);

	        wt1.write(writer1.toString());
	        wt1.close();

	      /*  VelocityContext context5 = new VelocityContext();
	        
	        context5.put("ops", tt);
	        context5.put("n", "new");
	        context5.put("Name", new VelocityCodeGenerator());

	        Template t5 = ve.getTemplate("resources/activemq-jms-ds.vm");
	        StringWriter writer5 = new StringWriter();
	        FileWriter wt5=new FileWriter(new File("resources/xmlFiles/activemq-jms-ds.xml"));
	        t5.merge(context5, writer5);

	        wt5.write(writer5.toString());
	        wt5.close();
	        
	        
	        VelocityContext context1 = new VelocityContext();
	        context1.put("ops", tt);
	        context1.put("n", "new");
	        context1.put("Name", new VelocityCodeGenerator());

	        Template t1 = ve.getTemplate("resources/EDMWSServiceImpl.vm");
	        StringWriter writer1 = new StringWriter();
	        FileWriter wt1=new FileWriter(new File("src/com/mastek/elixir/edmeis/webservices/implementation/EDMWSServiceImpl.java"));
	        t1.merge(context1, writer1);

	        wt1.write(writer1.toString());
	        wt1.close(); 
	        
	        
	        VelocityContext context2 = new VelocityContext();
	        context2.put("ops", tt);
	        context2.put("n", "new");
	        context2.put("Name", new VelocityCodeGenerator());

	        Template t2 = ve.getTemplate("resources/EDMServiceInvoker.vm");
	        StringWriter writer2 = new StringWriter();
	        FileWriter wt2=new FileWriter(new File("src/com/mastek/elixir/edmeis/webservices/implementation/EDMServiceInvoker.java"));
	        t2.merge(context2, writer2);

	        wt2.write(writer2.toString());
	        wt2.close(); 
	          
	     for(int i=0;i<tt.size();i++)
	      {
	    	  HashMap<String,String> mp=tt.get(i); 
	    	  VelocityContext context3 = new VelocityContext();
	        context3.put("op", mp);
	        context3.put("n", "new");
	        context3.put("Name", new VelocityCodeGenerator());

	        Template t3 = ve.getTemplate("resources/mdb_in.vm");
	        StringWriter writer3 = new StringWriter();
	        String fileName=mp.get("ejbnamein")+".java";
	        if(new File(fileName).exists()==false)
	        {
	        FileWriter wt3=new FileWriter(new File("resources/mdbJavaCode/"+fileName));
	        t3.merge(context3, writer3);

	        wt3.write(writer3.toString());
	        wt3.close();
	        }
	        
	        
	      }
	     
	     
	     for(int i=0;i<tt.size();i++)
	      {
	    	  HashMap<String,String> mp=tt.get(i); 
	    	  VelocityContext context7 = new VelocityContext();
	        context7.put("op", mp);
	        context7.put("n", "new");
	        context7.put("Name", new VelocityCodeGenerator());

	        Template t7 = ve.getTemplate("resources/mdb_ot.vm");
	        StringWriter writer7 = new StringWriter();
	        String fileName=mp.get("ejbnameot")+".java";
	        if(new File(fileName).exists()==false)
	        {
	        FileWriter wt7=new FileWriter(new File("resources/mdbJavaCode/"+fileName));
	        t7.merge(context7, writer7);

	        wt7.write(writer7.toString());
	        wt7.close();
	        }
	        
	        
	      }
	     
	     
	     for(int i=0;i<tt.size();i++)
	      {
	    	  HashMap<String,String> mp=tt.get(i); 
	    	  VelocityContext context3 = new VelocityContext();
	        context3.put("op", mp);
	        context3.put("n", "new");
	        context3.put("Name", new VelocityCodeGenerator());

	        Template t3 = ve.getTemplate("resources/mdb3_in_HornetQ.vm");
	        StringWriter writer3 = new StringWriter();
	        String fileName=mp.get("ejbnamein")+".java";
	        if(new File(fileName).exists()==false)
	        {
	        FileWriter wt3=new FileWriter(new File("resources/mdbejb3javaCode/"+fileName));
	        t3.merge(context3, writer3);

	        wt3.write(writer3.toString());
	        wt3.close();
	        }
	        
	        
	      }
	     
	     
	     for(int i=0;i<tt.size();i++)
	      {
	    	  HashMap<String,String> mp=tt.get(i); 
	    	  VelocityContext context7 = new VelocityContext();
	        context7.put("op", mp);
	        context7.put("n", "new");
	        context7.put("Name", new VelocityCodeGenerator());

	        Template t7 = ve.getTemplate("resources/mdb3_ot_HornetQ.vm");
	        StringWriter writer7 = new StringWriter();
	        String fileName=mp.get("ejbnameot")+".java";
	        if(new File(fileName).exists()==false)
	        {
	        FileWriter wt7=new FileWriter(new File("resources/mdbejb3javaCode/"+fileName));
	        t7.merge(context7, writer7);

	        wt7.write(writer7.toString());
	        wt7.close();
	        }
	        
	        
	      }

	     
	     
	     
	     for(int i=0;i<tt.size();i++)
	      {
	    	  HashMap<String,String> mp=tt.get(i); 
	    	  VelocityContext context4 = new VelocityContext();
	        context4.put("op", mp);
	        context4.put("n", "new");
	        context4.put("Name", new VelocityCodeGenerator());

	        Template t4 = ve.getTemplate("resources/res.vm");
	        StringWriter writer4 = new StringWriter();
	        String fileName=mp.get("resName");
	        if(new File(fileName).exists()==false)
	        {
	        FileWriter wt4=new FileWriter(new File("resources/resourceConfig/"+fileName));
	        t4.merge(context4, writer4);

	        wt4.write(writer4.toString());
	        wt4.close();
	        }
	        
	        
	      }
	     
	     
	     VelocityContext context1 = new VelocityContext();
	        context1.put("ops", tt);
	        context1.put("n", "new");
	        context1.put("Name", new VelocityCodeGenerator());

	        Template t1 = ve.getTemplate("resources/jboss.vm");
	        StringWriter writer1 = new StringWriter();
	        FileWriter wt1=new FileWriter(new File("resources/xmlFiles/jboss.xml"));
	        t1.merge(context1, writer1);

	        wt1.write(writer1.toString());
	        wt1.close(); 
	     */
	}
	
	

}
