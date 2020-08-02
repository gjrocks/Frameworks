package com.gj;

import java.util.*;
import java.math.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
public class XYZReportFields
{

String[] fields={
"tid","tarchived","tstatusValue","tourReference","tcrbReference","tchannelTypeValue","tdisclosureType","tworkingWithVulnerableAdults","tworkingWithChildren","trouteTakenValue","texternalValidationCheckedValue","texternalValidationNotes","texternalValidationRef","tinterviewCompletedValue","tinterviewNotes","tvolunteer","trepeatCheck","tdateCreated","tpositionAppliedFor","tconsentDate","tevidenceCheckedByDate","tevidenceCheckedBy","tsubmitDate","tcounterSignatoryNumber","tcsigDate","tsentDate","tresultDate","tsurname","tforename","tdob","tniNumber","tresult","tnumber","tissueDate","treceivedDate","tcustomerSentDate","tcertificateSeenDate","triskAssessment","tpovaFirstCheckRequired","tpovaReference","tpovaDate","tinternalReference","tname","tpostcode","tenhancedFeeDecimal","tstandardFeeDecimal","tbasicFeeDecimal","tbaseFeeDecimal","tisaadultfirstFeeDecimal","tisaadultfirstDefault","tvatAmount","tprice","tcostcode","tinvoiceMessageSentDate","tcode","tcertificateUploadConsented"
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
return projectionList;
}
	}
	