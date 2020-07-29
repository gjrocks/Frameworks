package com.gj;

import java.util.*;
import java.math.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.jzen.cheqs.model.report.ReportField;
import org.jzen.cheqs.model.types.ReportFieldGroup;
public class ContinuousUpdateReportReportFields
{

String[] fields={
"tid","tarchived","tourReference","tchannelTypeValue","tsurname","tforename","tdob","tnumber","tinternalReference","tname","treference","tupdateServiceRegistrationDate","tupdateServiceResultStatus","tupdateServiceRunType","tupdateServiceRunDate","tupdateServiceResultDate","tupdateServiceResultType","tupdateServiceIncluded","tupdateServiceConsent","tcontinuousUpdateFrequencyPeriod","tcontinuousUpdateFrequencyNo"
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
projectionList.add( Projections.property("archived"),"tarchived");
projectionList.add( Projections.property("ourReference"),"tourReference");
projectionList.add( Projections.property("channelTypeValue"),"tchannelTypeValue");
projectionList.add( Projections.property("surname"),"tsurname");
projectionList.add( Projections.property("forename"),"tforename");
projectionList.add( Projections.property("dob"),"tdob");
projectionList.add( Projections.property("disclosure.number"),"tnumber");
projectionList.add( Projections.property("organisation.internalReference"),"tinternalReference");
projectionList.add( Projections.property("organisation.name"),"tname");
projectionList.add( Projections.property("organisation.reference"),"treference");
projectionList.add( Projections.property("updateServiceRegistrationDate"),"tupdateServiceRegistrationDate");
projectionList.add( Projections.property("updateServiceResultStatus"),"tupdateServiceResultStatus");
projectionList.add( Projections.property("updateServiceRunType"),"tupdateServiceRunType");
projectionList.add( Projections.property("updateServiceRunDate"),"tupdateServiceRunDate");
projectionList.add( Projections.property("updateServiceResultDate"),"tupdateServiceResultDate");
projectionList.add( Projections.property("updateServiceResultType"),"tupdateServiceResultType");
projectionList.add( Projections.property("updateServiceIncluded"),"tupdateServiceIncluded");
projectionList.add( Projections.property("updateServiceConsent"),"tupdateServiceConsent");
projectionList.add( Projections.property("organisation.continuousUpdateFrequencyPeriod"),"tcontinuousUpdateFrequencyPeriod");
projectionList.add( Projections.property("organisation.continuousUpdateFrequencyNo"),"tcontinuousUpdateFrequencyNo");
return projectionList;
}


public List<ReportField> getReportFields()
{
    List<ReportField> reportFields = new LinkedList<ReportField>();
		reportFields.add(new ReportField("tid", "id", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tarchived", "archived", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tourReference", "ourReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tchannelTypeValue", "channelTypeValue", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsurname", "surname", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tforename", "forename", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tdob", "dob", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tnumber", "disclosure.number", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tinternalReference", "organisation.internalReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tname", "organisation.name", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("treference", "organisation.reference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceRegistrationDate", "updateServiceRegistrationDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceResultStatus", "updateServiceResultStatus", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceRunType", "updateServiceRunType", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceRunDate", "updateServiceRunDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceResultDate", "updateServiceResultDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceResultType", "updateServiceResultType", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceIncluded", "updateServiceIncluded", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tupdateServiceConsent", "updateServiceConsent", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcontinuousUpdateFrequencyPeriod", "organisation.continuousUpdateFrequencyPeriod", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcontinuousUpdateFrequencyNo", "organisation.continuousUpdateFrequencyNo", ReportFieldGroup.COMMON) );
	    
	return reportFields;	
}




}
	