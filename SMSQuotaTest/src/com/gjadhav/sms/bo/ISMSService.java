package com.gjadhav.sms.bo;



import com.gjadhav.sms.model.SMSQuotaConfig;



public interface ISMSService {
	
	public void sendSMS() throws Exception;
	public SMSQuotaConfig getSMSQuotaConfig() throws Exception;
	public SMSQuotaConfig persistSMSQuotaConfig(SMSQuotaConfig quota) throws Exception;
}
