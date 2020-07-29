package com.gj;

import java.util.*;
import java.math.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.jzen.cheqs.model.report.ReportField;
import org.jzen.cheqs.model.types.ReportFieldGroup;
public class SystemUserReportFields
{

String[] fields={
"tuserauthority","tuseremail","tuserpassword","tuserisOneTimePassword","tuserisOneTimeDOB","tusertitle","tuserfirstname","tusersurname","tuserdateOfBirth","tuserposition","tusercounterSignatoryNumber","tuserscotlandRegisteredPersonCode","tuserscotlandRegisteredPersonName","tuserisEnabled","tuserisExpired","tuserisActivated","tuserorganisation","tuserlinkedOrganisations","tuserlastLoginDate","tuserdateLockedUntil","tuserdateCreated","tuserdateUpdated","tuserbillingDetailsXml"
};

public String[] getFields() {
	return fields;
}

public void setFields(String[] fields) {
	this.fields = fields;
}

//org.hibernate.criterion.ProjectionList projectionList=org.hibernate.criterion.Projections.projectionList();
 
                                            
    //Projection                    
public ProjectionList getProjectionList()
{

	ProjectionList projectionList1 = Projections.projectionList()
            .add( Projections.id().as("tid"))
            .add( Projections.property("id"),"tid")
            .add( Projections.property("name"), "torgName" )
            .add( Projections.property("reference"), "torgRef" )
            .add( Projections.property("address.addressLine1"), "torgAddressLine1" )
            .add( Projections.property("address.addressLine2"), "torgAddressLine2" )
            .add( Projections.property("address.town"), "torgAddressTown" )
            .add( Projections.property("address.postcode"), "torgAddressPostcode" );	
	
	
org.hibernate.criterion.ProjectionList projectionList=org.hibernate.criterion.Projections.projectionList();
projectionList.add( Projections.property("authority"),"tuserauthority");
projectionList.add( Projections.property("email"),"tuseremail");
projectionList.add( Projections.property("password"),"tuserpassword");
projectionList.add( Projections.property("isOneTimePassword"),"tuserisOneTimePassword");
projectionList.add( Projections.property("isOneTimeDOB"),"tuserisOneTimeDOB");
projectionList.add( Projections.property("title"),"tusertitle");
projectionList.add( Projections.property("firstname"),"tuserfirstname");
projectionList.add( Projections.property("surname"),"tusersurname");
projectionList.add( Projections.property("dateOfBirth"),"tuserdateOfBirth");
projectionList.add( Projections.property("position"),"tuserposition");
projectionList.add( Projections.property("counterSignatoryNumber"),"tusercounterSignatoryNumber");
projectionList.add( Projections.property("scotlandRegisteredPersonCode"),"tuserscotlandRegisteredPersonCode");
projectionList.add( Projections.property("scotlandRegisteredPersonName"),"tuserscotlandRegisteredPersonName");
projectionList.add( Projections.property("isEnabled"),"tuserisEnabled");
projectionList.add( Projections.property("isExpired"),"tuserisExpired");
projectionList.add( Projections.property("isActivated"),"tuserisActivated");
projectionList.add( Projections.property("organisation"),"tuserorganisation");
projectionList.add( Projections.property("linkedOrganisations"),"tuserlinkedOrganisations");
projectionList.add( Projections.property("lastLoginDate"),"tuserlastLoginDate");
projectionList.add( Projections.property("dateLockedUntil"),"tuserdateLockedUntil");
projectionList.add( Projections.property("dateCreated"),"tuserdateCreated");
projectionList.add( Projections.property("dateUpdated"),"tuserdateUpdated");
projectionList.add( Projections.property("billingDetailsXml"),"tuserbillingDetailsXml");


for(int i=0;i<projectionList.getLength();i++)
{
	projectionList1.add(projectionList.getProjection(i));
}



return projectionList;
}


public List<ReportField> getReportFields()
{
    List<ReportField> reportFields = new LinkedList<ReportField>();
		reportFields.add(new ReportField("tuserauthority", "authority", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuseremail", "email", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserpassword", "password", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserisOneTimePassword", "isOneTimePassword", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserisOneTimeDOB", "isOneTimeDOB", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tusertitle", "title", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserfirstname", "firstname", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tusersurname", "surname", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserdateOfBirth", "dateOfBirth", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserposition", "position", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tusercounterSignatoryNumber", "counterSignatoryNumber", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserscotlandRegisteredPersonCode", "scotlandRegisteredPersonCode", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserscotlandRegisteredPersonName", "scotlandRegisteredPersonName", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserisEnabled", "isEnabled", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserisExpired", "isExpired", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserisActivated", "isActivated", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserorganisation", "organisation", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserlinkedOrganisations", "linkedOrganisations", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserlastLoginDate", "lastLoginDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserdateLockedUntil", "dateLockedUntil", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserdateCreated", "dateCreated", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserdateUpdated", "dateUpdated", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tuserbillingDetailsXml", "billingDetailsXml", ReportFieldGroup.COMMON) );
	    
	return reportFields;	
}


public List<Projection> getProjectionList1()
{
	List<Projection> list=new LinkedList<Projection>();
org.hibernate.criterion.ProjectionList projectionList=org.hibernate.criterion.Projections.projectionList();
projectionList.getProjection(0);
projectionList.add( Projections.property("authority"),"tuserauthority");
projectionList.add( Projections.property("email"),"tuseremail");
projectionList.add( Projections.property("password"),"tuserpassword");
projectionList.add( Projections.property("isOneTimePassword"),"tuserisOneTimePassword");
projectionList.add( Projections.property("isOneTimeDOB"),"tuserisOneTimeDOB");
projectionList.add( Projections.property("title"),"tusertitle");
projectionList.add( Projections.property("firstname"),"tuserfirstname");
projectionList.add( Projections.property("surname"),"tusersurname");
projectionList.add( Projections.property("dateOfBirth"),"tuserdateOfBirth");
projectionList.add( Projections.property("position"),"tuserposition");
projectionList.add( Projections.property("counterSignatoryNumber"),"tusercounterSignatoryNumber");
projectionList.add( Projections.property("scotlandRegisteredPersonCode"),"tuserscotlandRegisteredPersonCode");
projectionList.add( Projections.property("scotlandRegisteredPersonName"),"tuserscotlandRegisteredPersonName");
projectionList.add( Projections.property("isEnabled"),"tuserisEnabled");
projectionList.add( Projections.property("isExpired"),"tuserisExpired");
projectionList.add( Projections.property("isActivated"),"tuserisActivated");
projectionList.add( Projections.property("organisation"),"tuserorganisation");
projectionList.add( Projections.property("linkedOrganisations"),"tuserlinkedOrganisations");
projectionList.add( Projections.property("lastLoginDate"),"tuserlastLoginDate");
projectionList.add( Projections.property("dateLockedUntil"),"tuserdateLockedUntil");
projectionList.add( Projections.property("dateCreated"),"tuserdateCreated");
projectionList.add( Projections.property("dateUpdated"),"tuserdateUpdated");
projectionList.add( Projections.property("billingDetailsXml"),"tuserbillingDetailsXml");
return list;
}


}
	