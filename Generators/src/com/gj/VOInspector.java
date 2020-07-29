package com.gj;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.Map;

public class VOInspector {

	public static void main(String[] args)  throws Exception{
		
		
		//Class cl=uk.co.disclosurescotland.xmlns.dsdisclosureapplicationcommon.DSNationalInsuranceDetailsStructure.class;
		Class cl=String.class;
	Field[] fields=cl.getDeclaredFields();
	for(int i=0;i<fields.length;i++)
	{
		//System.out.println(fields[i].getName());
		System.out.println(fields[i].getName() + ":" +fields[i].getType().getSimpleName());
	}
Connection conn=DBProcessor.getConnection();
Map<String, String> mp=DBProcessor.getColumnNames("crb_applications",conn);

LinkedList<String> a=new LinkedList<String>();

a.add("ca_archive");
a.add("ca_version");
a.add("ca_renewal_date");
a.add("ca_leavers_date");
a.add("ca_updateservice_date");
a.add("ca_sms_enabled");
a.add("ca_status");
a.add("ca_channel_type");
a.add("ca_additional_info");
a.add("ca_our_ref");
a.add("ca_crb_ref");
a.add("ca_supplier_ref");
a.add("ca_csig_number");
a.add("ca_csig_name");
a.add("ca_csig_auth_date");
a.add("ca_consent");
a.add("ca_consent_date");
a.add("ca_submit_date");
a.add("ca_pova_ref");
a.add("ca_pova_date");
a.add("ca_surname");
a.add("ca_forename");
a.add("ca_ni_number");
a.add("ca_dob");
a.add("ca_personal_xml");
a.add("ca_query_flagged");
a.add("ca_sent_message_id");
a.add("ca_sent_date");
a.add("ca_receipt_message_id");
a.add("ca_receipt_date");
a.add("ca_result_message_id");
a.add("ca_result_date");
a.add("ca_error_text");
a.add("ca_payment_indicator");
a.add("ca_date_created");
a.add("ca_date_updated");
a.add("ca_check_cost_xml");
a.add("ca_invoice_message_sent_id");
a.add("ca_invoice_message_sent_date");
a.add("ca_po_number");
a.add("ca_certificate_seen_date");
a.add("ca_certificate_not_required");
a.add("ca_payment_receipt_email_requested");
a.add("ca_certificate_upload_consented");
a.add("ca_payment_receipt_sent_date");
a.add("ca_renewal_sent_date");


for(int i=0;i<a.size();i++){
	
}
DBProcessor.closeResource(conn);
//System.out.println(mp.get(a.get(i)));

}

}
