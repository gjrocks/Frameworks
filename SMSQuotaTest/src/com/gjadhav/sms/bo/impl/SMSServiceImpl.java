package com.gjadhav.sms.bo.impl;

import com.gjadhav.sms.bo.ISMSService;
import com.gjadhav.sms.dao.impl.SMSQuotaConfigDao;
import com.gjadhav.sms.model.SMSQuotaConfig;



public class SMSServiceImpl implements ISMSService{
	
	SMSQuotaConfigDao smsDao;
	

	public SMSQuotaConfigDao getSmsDao() {
		return smsDao;
	}

	public void setSmsDao(SMSQuotaConfigDao smsDao) {
		this.smsDao = smsDao;
	}



	@Override
	public SMSQuotaConfig getSMSQuotaConfig() throws Exception {

		return getSmsDao().getSMSQuotaConfig();
	}

	@Override
	public SMSQuotaConfig persistSMSQuotaConfig(SMSQuotaConfig quota) throws Exception {
	
		 getSmsDao().store(quota);
		 return quota;
	}

	@Override
	public synchronized void sendSMS() throws Exception {

	System.out.println("Entered sendSMS" +Thread.currentThread().getName());
		//	SMSQuotaConfig config = this.getSMSQuotaConfig();
		/*synchronized (config) {*/
			//ThreadManager.doAll(config);
			ThreadManager.doAllNew(this);
			/*System.out.println(config.getVersion());

			if (config != null && config.getBalance() == 0)
				throw new Exception("SMS Quota balance is 0, can not proceed to send SMS message");
			config.setBalance(config.getBalance() - 1);
			this.persistSMSQuotaConfig(config);*/
			// this.persistSMSQuotaConfig(config);
			try {
				Thread.sleep(1000);
				System.out.println("Message sent");
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Ended sendSMS" +Thread.currentThread().getName());	

		//}

	}
}
