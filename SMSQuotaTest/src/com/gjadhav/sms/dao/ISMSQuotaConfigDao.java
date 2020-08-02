package com.gjadhav.sms.dao;

import com.gjadhav.sms.model.SMSQuotaConfig;



public interface ISMSQuotaConfigDao {

	void store(SMSQuotaConfig smsQuotaConfig);

	SMSQuotaConfig getSMSQuotaConfig() throws Exception;
}
