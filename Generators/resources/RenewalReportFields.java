package org.jzen.cheqs.model.view;

import java.util.*;
import java.math.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.jzen.cheqs.model.report.ReportField;
import org.jzen.cheqs.model.types.ReportFieldGroup;
public class RenewalReportFields
{

String[] fields={
"tid","tarchived","tstatusValue","tourReference","tcrbReference","tchannelTypeValue","tdisclosureType","tworkingWithVulnerableAdults","tworkingWithChildren","trouteTakenValue","texternalValidationCheckedValue","texternalValidationNotes","texternalValidationRef","tinterviewCompletedValue","tinterviewNotes","tvolunteer","trepeatCheck","tdateCreated","tpositionAppliedFor","tconsentDate","tevidenceCheckedByDate","tevidenceCheckedBy","tsubmitDate","tcounterSignatoryNumber","tcsigDate","tsentDate","tresultDate","tsurname","tforename","tdob","tniNumber","tresult","tnumber","tissueDate","treceivedDate","tcustomerSentDate","tcertificateSeenDate","triskAssessment","tpovaFirstCheckRequired","tpovaReference","tpovaDate","tinternalReference","tname","tpostcode","tenhancedFeeDecimal","tstandardFeeDecimal","tbasicFeeDecimal","tbaseFeeDecimal","tisaadultfirstFeeDecimal","tisaadultfirstDefault","tvatAmount","tprice","tcostcode","tinvoiceMessageSentDate","tcode","tcertificateUploadConsented","trenewalDate","tleaversDate"
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
projectionList.add( Projections.property("statusValue"),"tstatusValue");
projectionList.add( Projections.property("ourReference"),"tourReference");
projectionList.add( Projections.property("crbReference"),"tcrbReference");
projectionList.add( Projections.property("channelTypeValue"),"tchannelTypeValue");
projectionList.add( Projections.property("sectionY.disclosureType"),"tdisclosureType");
projectionList.add( Projections.property("sectionY.workingWithVulnerableAdults"),"tworkingWithVulnerableAdults");
projectionList.add( Projections.property("sectionY.workingWithChildren"),"tworkingWithChildren");
projectionList.add( Projections.property("idCheckAdditionalInfo.routeTakenValue"),"trouteTakenValue");
projectionList.add( Projections.property("idCheckAdditionalInfo.externalValidationCheckedValue"),"texternalValidationCheckedValue");
projectionList.add( Projections.property("idCheckAdditionalInfo.externalValidationNotes"),"texternalValidationNotes");
projectionList.add( Projections.property("idCheckAdditionalInfo.externalValidationRef"),"texternalValidationRef");
projectionList.add( Projections.property("idCheckAdditionalInfo.interviewCompletedValue"),"tinterviewCompletedValue");
projectionList.add( Projections.property("idCheckAdditionalInfo.interviewNotes"),"tinterviewNotes");
projectionList.add( Projections.property("sectionY.volunteer"),"tvolunteer");
projectionList.add( Projections.property("sectionY.repeatCheck"),"trepeatCheck");
projectionList.add( Projections.property("sectionY.dateCreated"),"tdateCreated");
projectionList.add( Projections.property("employmentDetails.positionAppliedFor"),"tpositionAppliedFor");
projectionList.add( Projections.property("consentDate"),"tconsentDate");
projectionList.add( Projections.property("identification.evidenceCheckedByDate"),"tevidenceCheckedByDate");
projectionList.add( Projections.property("identification.evidenceCheckedBy"),"tevidenceCheckedBy");
projectionList.add( Projections.property("submitDate"),"tsubmitDate");
projectionList.add( Projections.property("counterSignatoryNumber"),"tcounterSignatoryNumber");
projectionList.add( Projections.property("csigDate"),"tcsigDate");
projectionList.add( Projections.property("sentDate"),"tsentDate");
projectionList.add( Projections.property("resultDate"),"tresultDate");
projectionList.add( Projections.property("surname"),"tsurname");
projectionList.add( Projections.property("forename"),"tforename");
projectionList.add( Projections.property("dob"),"tdob");
projectionList.add( Projections.property("niNumber"),"tniNumber");
projectionList.add( Projections.property("disclosure.result"),"tresult");
projectionList.add( Projections.property("disclosure.number"),"tnumber");
projectionList.add( Projections.property("disclosure.issueDate"),"tissueDate");
projectionList.add( Projections.property("disclosure.receivedDate"),"treceivedDate");
projectionList.add( Projections.property("disclosure.customerSentDate"),"tcustomerSentDate");
projectionList.add( Projections.property("certificateSeenDate"),"tcertificateSeenDate");
projectionList.add( Projections.property("disclosure.riskAssessment"),"triskAssessment");
projectionList.add( Projections.property("sectionY.povaFirstCheckRequired"),"tpovaFirstCheckRequired");
projectionList.add( Projections.property("povaReference"),"tpovaReference");
projectionList.add( Projections.property("povaDate"),"tpovaDate");
projectionList.add( Projections.property("organisation.internalReference"),"tinternalReference");
projectionList.add( Projections.property("organisation.name"),"tname");
projectionList.add( Projections.property("organisation.address.postcode"),"tpostcode");
projectionList.add( Projections.property("enhancedFeeDecimal"),"tenhancedFeeDecimal");
projectionList.add( Projections.property("standardFeeDecimal"),"tstandardFeeDecimal");
projectionList.add( Projections.property("basicFeeDecimal"),"tbasicFeeDecimal");
projectionList.add( Projections.property("baseFeeDecimal"),"tbaseFeeDecimal");
projectionList.add( Projections.property("isaadultfirstFeeDecimal"),"tisaadultfirstFeeDecimal");
projectionList.add( Projections.property("isaadultfirstDefault"),"tisaadultfirstDefault");
projectionList.add( Projections.property("vatAmount"),"tvatAmount");
projectionList.add( Projections.property("price"),"tprice");
projectionList.add( Projections.property("identification.costcode"),"tcostcode");
projectionList.add( Projections.property("invoiceMessageSentDate"),"tinvoiceMessageSentDate");
projectionList.add( Projections.property("organisation.sector.code"),"tcode");
projectionList.add( Projections.property("certificateUploadConsented"),"tcertificateUploadConsented");
projectionList.add( Projections.property("renewalDate"),"trenewalDate");
projectionList.add( Projections.property("leaversDate"),"tleaversDate");
return projectionList;
}


public List<ReportField> getReportFields()
{
    List<ReportField> reportFields = new LinkedList<ReportField>();
		reportFields.add(new ReportField("tid", "id", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tarchived", "archived", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tstatusValue", "statusValue", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tourReference", "ourReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcrbReference", "crbReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tchannelTypeValue", "channelTypeValue", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tdisclosureType", "sectionY.disclosureType", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tworkingWithVulnerableAdults", "sectionY.workingWithVulnerableAdults", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tworkingWithChildren", "sectionY.workingWithChildren", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("trouteTakenValue", "idCheckAdditionalInfo.routeTakenValue", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("texternalValidationCheckedValue", "idCheckAdditionalInfo.externalValidationCheckedValue", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("texternalValidationNotes", "idCheckAdditionalInfo.externalValidationNotes", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("texternalValidationRef", "idCheckAdditionalInfo.externalValidationRef", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tinterviewCompletedValue", "idCheckAdditionalInfo.interviewCompletedValue", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tinterviewNotes", "idCheckAdditionalInfo.interviewNotes", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tvolunteer", "sectionY.volunteer", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("trepeatCheck", "sectionY.repeatCheck", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tdateCreated", "sectionY.dateCreated", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tpositionAppliedFor", "employmentDetails.positionAppliedFor", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tconsentDate", "consentDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tevidenceCheckedByDate", "identification.evidenceCheckedByDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tevidenceCheckedBy", "identification.evidenceCheckedBy", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsubmitDate", "submitDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcounterSignatoryNumber", "counterSignatoryNumber", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcsigDate", "csigDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsentDate", "sentDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tresultDate", "resultDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tsurname", "surname", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tforename", "forename", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tdob", "dob", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tniNumber", "niNumber", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tresult", "disclosure.result", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tnumber", "disclosure.number", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tissueDate", "disclosure.issueDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("treceivedDate", "disclosure.receivedDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcustomerSentDate", "disclosure.customerSentDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcertificateSeenDate", "certificateSeenDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("triskAssessment", "disclosure.riskAssessment", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tpovaFirstCheckRequired", "sectionY.povaFirstCheckRequired", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tpovaReference", "povaReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tpovaDate", "povaDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tinternalReference", "organisation.internalReference", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tname", "organisation.name", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tpostcode", "organisation.address.postcode", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tenhancedFeeDecimal", "enhancedFeeDecimal", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tstandardFeeDecimal", "standardFeeDecimal", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tbasicFeeDecimal", "basicFeeDecimal", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tbaseFeeDecimal", "baseFeeDecimal", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tisaadultfirstFeeDecimal", "isaadultfirstFeeDecimal", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tisaadultfirstDefault", "isaadultfirstDefault", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tvatAmount", "vatAmount", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tprice", "price", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcostcode", "identification.costcode", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tinvoiceMessageSentDate", "invoiceMessageSentDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcode", "organisation.sector.code", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tcertificateUploadConsented", "certificateUploadConsented", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("trenewalDate", "renewalDate", ReportFieldGroup.COMMON) );
		reportFields.add(new ReportField("tleaversDate", "leaversDate", ReportFieldGroup.COMMON) );
	    
	return reportFields;	
}




}
	