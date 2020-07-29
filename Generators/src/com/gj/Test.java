package com.gj;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

/*import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;*/

public class Test {

	public static List<String> var=new LinkedList<String>();
	
	public static void main(String[] args) throws Exception{
		
/*Class clz=Class.forName("com.gj.A");
//System.out.println(clz);
clz.getDeclaredFields();

for (Field field : clz.getDeclaredFields()) {
	System.out.println(field.getClass().getName()+ "::" +field.getType()+"::" +field.getDeclaringClass());
}
extractStringFields(clz,"com.gj.A","com.gj");
for(int i=0;i<var.size();i++)
{
	System.out.println(var.get(i));
}*/

	//	new Test().getLinkedListFields();
		//ganu();
	   /* Properties p=new Properties();
	    p=DBProcessor.loadProperties("quartz1.properties", p);
	    Set keys=p.keySet();
	   Iterator t=keys.iterator();
	    while(t.hasNext())
	    {
		String key=t.next().toString();
		String h="<prop key=\""+key+"\">${"+key+"}</prop>";
		System.out.println(h);
		
	    }*/
		
		
		//Class cl= org.jzen.cheqs.services.integration.ds.submission.client.schema.B2BWebserviceConfirmationOfIdentityStructure.class;
		Class cl=null;
		Field [] fi=cl.getDeclaredFields();
		
		for(int i=0;i<fi.length;i++)
		{
			System.out.println(fi[i].getType().getSimpleName());
		}
		
	}

	public static void ganu()
	{/*
		
		ProjectionList li=	 Projections.projectionList()
         .add( Projections.id().as("tid"))
          //amendISM2012/10: 20824: Enhance reports for archived apps
         .add( Projections.property("archived"),"tarchive")
         .add( Projections.property("statusValue"), "tstatus" )
         .add( Projections.property("ourReference"), "tourReference" )
         .add( Projections.property("crbReference"), "tcrbReference" )
         .add( Projections.property("channelTypeValue"), "tchannelType" )
         .add( Projections.property("sectionY.disclosureType"), "tdisclosureType" ) 
          //amend2012/04/19: v5.1 #17007: two new fields for section y    
			.add( Projections.property("sectionY.workingWithVulnerableAdults"), "tworkingWithVulnerableAdults" ) 
			.add( Projections.property("sectionY.workingWithChildren"), "tworkingWithChildren" )
			//imorrison2012/08/09: #20031
			.add( Projections.property("idCheckAdditionalInfo.routeTakenValue"),"tidRouteTaken")
			//imorrison2012/08/10: #20031
			.add( Projections.property("idCheckAdditionalInfo.externalValidationCheckedValue"),"texternalValidationChecked")
			.add( Projections.property("idCheckAdditionalInfo.externalValidationNotes"),"texternalValidationNotes")
			.add( Projections.property("idCheckAdditionalInfo.externalValidationRef"),"texternalValidationRef")
			.add( Projections.property("idCheckAdditionalInfo.interviewCompletedValue"),"tinterviewCompleted")
			.add( Projections.property("idCheckAdditionalInfo.interviewNotes"),"tinterviewNotes")
         .add( Projections.property("sectionY.volunteer"), "tvolunteer" )  
         .add( Projections.property("sectionY.repeatCheck"), "trepeatCheck" )  
         .add( Projections.property("sectionY.dateCreated"), "tsectionyDate" ) 
         .add( Projections.property("employmentDetails.positionAppliedFor"), "tpositionAppliedFor" )                                                                    
         .add( Projections.property("consentDate"), "tdateCreated" )      
         
         .add( Projections.property("identification.evidenceCheckedByDate"), "tidCheckedByDate" ) 
         .add( Projections.property("identification.evidenceCheckedBy"), "tidCheckedBy" ) 
                                 
         .add( Projections.property("submitDate"), "tsubmittedByDate" ) 
         
         .add( Projections.property("counterSignatoryNumber"), "tcsigNo" ) 
         .add( Projections.property("csigDate"), "tcsigDate" ) 
         
         .add( Projections.property("sentDate"), "tsentDate" ) 
         .add( Projections.property("resultDate"), "tresultDate" ) 
                                                                                   
         .add( Projections.property("surname"), "tsurname" )
         .add( Projections.property("forename"), "tforename" )
         .add( Projections.property("dob"), "tdob" ) 
         //amend2012/04/17: v5.1 #18660 ni no is required now
         .add( Projections.property("niNumber"), "tniNumber" )                        
         
         
         .add( Projections.property("disclosure.result"), "tdisclosureResult" )  
         .add( Projections.property("disclosure.number"), "tdisclosureNo" )
         .add( Projections.property("disclosure.issueDate"), "tdisclosureIssueDate" )
         .add( Projections.property("disclosure.receivedDate"), "tdisclosureReceivedDate" )
         .add( Projections.property("disclosure.customerSentDate"), "tdisclosureSentDate" )
         .add( Projections.property("certificateSeenDate"), "tcertificateSeenDate" )
         .add( Projections.property("disclosure.riskAssessment"), "triskAssessment" )
         
         .add( Projections.property("sectionY.povaFirstCheckRequired"), "tpovaRequired" )
         .add( Projections.property("povaReference"), "tpovaReference" )
         .add( Projections.property("povaDate"), "tpovaDate" )
         
         .add( Projections.property("org.internalReference"), "torgInternalRef" )                                                
         .add( Projections.property("org.name"), "torgName" )  
         //amendLL2011/11: #10396 fields for invoice report
         .add( Projections.property("org.address.postcode"), "torgPostcode" )                        
         .add( Projections.property("enhancedFeeDecimal"), "tenhancedFeeDecimal" ) 
         .add( Projections.property("standardFeeDecimal"), "tstandardFeeDecimal" )
         .add( Projections.property("basicFeeDecimal"), "tbasicFeeDecimal" )
         .add( Projections.property("baseFeeDecimal"), "tbaseFeeDecimal" )
         .add( Projections.property("isaadultfirstFeeDecimal"), "tisaadultfirstFeeDecimal" )
         .add( Projections.property("isaadultfirstDefault"), "tisaadultfirstDefault" )
         .add( Projections.property("vatAmount"), "tvatAmount" )
         .add( Projections.property("price"), "tprice" )
         .add( Projections.property("identification.costcode"), "tcostcode" )
         //amendISM2013/02: #22181
         .add( Projections.property("invoiceMessageSentDate"), "tinvoiceMessageSentDate")
         //amendISM2013/02: #21988
         .add( Projections.property("sec.code"),"tsector")
         //amendISM2013/12: #25518
         .add( Projections.property("certificateUploadConsented"),"tcertificateUploadConsented")
         .add( Projections.property("renewalDate"),"trenewalDate")
		.add( Projections.property("leaversDate"),"tleaversDate");   
         
         for(int i=0;i<li.getLength();i++)
         {
		String g=li.getProjection(i).toString();
        System.out.print(g.split(" ")[0] +",");
         }
		
	*/}
	
	
	public static void extractStringFields(Class object,String parent,String packages) throws Exception {
	    for (Field field : object.getDeclaredFields()) {

	        field.setAccessible(true);
	       // System.out.println("filesd : "+field.getName());
	     //   Object value = field.get(object);
            
	        if(field.getType().getName().startsWith("com.gj"))
	        {
	        	//System.out.println("herer");
	        	
	        	extractStringFields(Class.forName(field.getType().getName()),parent,packages);
	        }else
	        {
	        
	        	String declaringClass=field.getDeclaringClass().getName();
	        	if(declaringClass.equalsIgnoreCase(parent) && !field.getType().getName().startsWith(packages) )
	        	{
	        	  	var.add(field.getType().getName() + " " + field.getName());
	        	}else
	        	{
	        		var.add(field.getType().getName() + " " + field.getName());
	        	}
	        
	        
	        }
	    }
	}
	
	
	public static List<Field> getAllFields(List<Field> fields, Class<?> type) {
	    for (Field field: type.getDeclaredFields()) {
	        fields.add(field);
	    }

	    if (type.getSuperclass() != null) {
	        fields = getAllFields(fields, type.getSuperclass());
	    }

	    return fields;
	}

	
	public static List<Method> getAllMethods(List<Method> fields, Class<?> type) {
	    for (Method field: type.getDeclaredMethods()) {
	        fields.add(field);
	    }

	    if (type.getSuperclass() != null) {
	        fields = getAllMethods(fields, type.getSuperclass());
	    }

	    return fields;
	}

	
public static List<String> tokens(String str,String aplitter)
{
	StringTokenizer st2 = new StringTokenizer(str, aplitter);
	 List<String> li=new LinkedList<String>();
	while (st2.hasMoreElements()) {
		li.add(st2.nextElement().toString());
	}
	
	return li;
}
	public void getLinkedListFields() {
	    System.out.println(getAllFields(new LinkedList<Field>(),A.class));
	}
}
