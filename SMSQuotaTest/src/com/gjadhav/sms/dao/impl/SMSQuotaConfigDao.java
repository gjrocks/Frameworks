package com.gjadhav.sms.dao.impl;

import java.util.List;






import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gjadhav.sms.dao.ISMSQuotaConfigDao;
import com.gjadhav.sms.model.SMSQuotaConfig;


/**
 * @author Ganesh Jadhav
 * 
 */
public class SMSQuotaConfigDao extends HibernateDaoSupport implements ISMSQuotaConfigDao {

	@Override
	public void store(SMSQuotaConfig smsQuotaConfig) {
		this.getHibernateTemplate().saveOrUpdate(smsQuotaConfig);
		
	}

	@Override
	public SMSQuotaConfig getSMSQuotaConfig() throws Exception {

		List result = this.getHibernateTemplate().findByNamedQuery("getAllSMSQuotaConfigs");
		return (SMSQuotaConfig) result.get(0);
	}

	
}
