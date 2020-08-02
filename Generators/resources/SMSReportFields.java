package com.gj;

import java.util.*;
import java.math.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.jzen.cheqs.model.report.ReportField;
import org.jzen.cheqs.model.types.ReportFieldGroup;
public class SMSReportFields
{

String[] fields={
"tid","torganisationReference","tapplicationReference","tmobileNumber","tsmsSentDate","tuserName","tsmsStatus","tdateCreated","tdateUpdated","tsmsKey"
};

public String[] getFields() {
	return fields;
}

public void setFields(String[] fields) {
	this.fields = fields;
}

//org.hibernate.criterion.ProjectionList projectionList=org.hibernate.criterion.Projections.projectionList();
 
                                            
                        
public ProjectionList getProjectionList()
{
org.hibernate.criterion.ProjectionList projectionList=org.hibernate.criterion.Projections.projectionList();
projectionList.add( Projections.property("id"),"tid");
projectionList.add( Projections.property("organisationReference"),"torganisationReference");
projectionList.add( Projections.property("applicationReference"),"tapplicationReference");
projectionList.add( Projections.property("mobileNumber"),"tmobileNumber");
projectionList.add( Projections.property("smsSentDate"),"tsmsSentDate");
projectionList.add( Projections.property("userName"),"tuserName");
projectionList.add( Projections.property("smsStatus"),"tsmsStatus");
projectionList.add( Projections.property("dateCreated"),"tdateCreated");
projectionList.add( Projections.property("dateUpdated"),"tdateUpdated");
projectionList.add( Projections.property("smsKey"),"tsmsKey");
return projectionList;
}


public List<ReportField> getReportFields()
{
    List<ReportField> reportFields = new LinkedList<ReportField>();
		reportFields.add(new ReportField("tid", "id", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("torganisationReference", "organisationReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tapplicationReference", "applicationReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tmobileNumber", "mobileNumber", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsmsSentDate", "smsSentDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserName", "userName", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsmsStatus", "smsStatus", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tdateCreated", "dateCreated", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tdateUpdated", "dateUpdated", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsmsKey", "smsKey", ReportFieldGroup.COMMON) );
	    
	return reportFields;	
}




}
	