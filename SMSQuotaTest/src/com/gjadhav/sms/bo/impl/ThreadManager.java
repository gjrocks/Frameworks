package com.gjadhav.sms.bo.impl;

import com.gjadhav.sms.model.SMSQuotaConfig;

public class ThreadManager {

	public synchronized static  void doAll(SMSQuotaConfig config) throws Exception
	{
		System.out.println(config.getVersion());

		if (config != null && config.getBalance() == 0)
			throw new Exception("SMS Quota balance is 0, can not proceed to send SMS message");
			
		    config.setBalance(config.getBalance() - 1);
		   
	}

	public synchronized static void doAllNew(SMSServiceImpl smsServiceImpl) throws Exception {
		System.out.println("Entered doAllNew" +Thread.currentThread().getName());
		SMSQuotaConfig config = smsServiceImpl.getSMSQuotaConfig();
		if (config != null && config.getBalance() == 0)
			throw new Exception("SMS Quota balance is 0, can not proceed to send SMS message");

		config.setBalance(config.getBalance() - 1);
		smsServiceImpl.persistSMSQuotaConfig(config);
		System.out.println( "End doAllNew" +Thread.currentThread().getName());

	}
}
