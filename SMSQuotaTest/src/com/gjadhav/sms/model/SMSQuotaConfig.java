package com.gjadhav.sms.model;

import java.util.Calendar;
import java.util.Date;


import org.springframework.util.StringUtils;

public class SMSQuotaConfig  {

	private static final long serialVersionUID = 1L;
	private Integer balance;
	private String bundleName;
	private Integer criticalBalancePercentage;
	private Integer lowBalancePercentage;
	private Date startDate;
	private Integer periodInDays;
	private Integer maxNoMessages;
    private long version;
    
	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public Integer getMaxNoMessages() {
		return maxNoMessages;
	}

	public void setMaxNoMessages(Integer maxNoMessages) {
		this.maxNoMessages = maxNoMessages;
	}

	public Integer getBalance() {
		return balance;
	}
	
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	public Integer getCriticalBalancePercentage() {
		return criticalBalancePercentage;
	}
	
	public void setCriticalBalancePercentage(Integer criticalBalancePercentage) {
		this.criticalBalancePercentage = criticalBalancePercentage;
	}
	
	public Integer getLowBalancePercentage() {
		return lowBalancePercentage;
	}
	
	public void setLowBalancePercentage(Integer lowBalancePercentage) {
		this.lowBalancePercentage = lowBalancePercentage;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Integer getPeriodInDays() {
		return periodInDays;
	}
	
	public void setPeriodInDays(Integer periodInDays) {
		this.periodInDays = periodInDays;
	}
	
	/* helper methods */
	/* Not persisted to db */
	
	private Integer getNumberForPercentage(int percentage) {
		return (getMaxNoMessages()  / 100) * percentage;
	}
	
	public Integer getCriticalBalanceNumber() {
		return getNumberForPercentage(getCriticalBalancePercentage());
	}
	
	public Integer getLowBalanceNumber() {
		return getNumberForPercentage(getLowBalancePercentage());
	}
	
	public Date getEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getStartDate());
		calendar.add(Calendar.DATE, getPeriodInDays());
		return calendar.getTime();
	}

	/*public SMSQuotaStatusType getQuotaStatus() {
		int currentBalance = getBalance();
		if (currentBalance <= getCriticalBalanceNumber())
			return SMSQuotaStatusType.RED;
		if (currentBalance <= getLowBalanceNumber()) 
			return SMSQuotaStatusType.AMBER;
		
		return SMSQuotaStatusType.GREEN;
		
	}*/
	
	public Integer getNoOfMessagesSent() {
		return (getMaxNoMessages() - balance);
	}

	public String getBundleName() {
		return bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}
	

	   
    protected Long id;
    protected Date dateCreated;
    protected Date dateUpdated;

    public void setId(Long id) {      
        if (id > 0) {
            this.id = id;
        }
    }

    public Long getId() {
        return id;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public boolean isNew(){
        return (id == null);
    }

    public void reset() {
      this.id = null;
    }
    
    public static String sortCommaSeparatedList(String csv) {
    	if (StringUtils.hasText(csv)) {
    		String[] values = StringUtils.commaDelimitedListToStringArray(csv);
    		values = StringUtils.sortStringArray(values);
            return StringUtils.arrayToCommaDelimitedString(values);
    	}
    	
    	return csv;
	}
    

}
