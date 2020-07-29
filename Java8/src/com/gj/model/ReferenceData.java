 /*
  * Copyright (c) 2008 Nick Allen.  All rights reserved.
  * Distribution and use of this source code (or the application compiled from this source code) 
  * and associated documentation ("Software"), with or without modification is prohibited.
  */
 package com.gj.model;

/**
 * Used as a common data object for reference data
 */
public class ReferenceData implements Comparable {

    private String  displayText;    
    private long    id;
    private String  shortCode;    
    private int     count;
    private Boolean usedForCRB;	//amendLL2011/04: #10810 new fields
    private Boolean usedForDS;	
    private Boolean usedForPayment;	//amendLL2011/08: new field
    private String  nationality;  //amendLL2012/07: v6.0 #19857
    private Boolean inEea;
    
    // used to sort
    public int compareTo(Object o) {
        final ReferenceData obj = (ReferenceData)o;
        return this.getDisplayText().compareToIgnoreCase(obj.getDisplayText());    
    }

    public String getDisplayText() {
        return this.displayText;
    }

    public long getId() {
        return this.id;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }
    

    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("id = '").append(id);
        sb.append("' ;shortCode = '").append(shortCode); 
        sb.append("' ;displayText = ").append(displayText);                  
        return sb.toString();
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    
    public void setUsedForCRB(Boolean usedForCRB) {
        this.usedForCRB = usedForCRB;
    }
    public Boolean getUsedForCRB() {
        return usedForCRB;
    }
    public void setUsedForDS(Boolean usedForDS) {
        this.usedForDS = usedForDS;
    }
    public Boolean getUsedForDS() {
        return usedForDS;
    }

	public Boolean getUsedForPayment() {
		return usedForPayment;
	}
	public void setUsedForPayment(Boolean usedForPayment) {
		this.usedForPayment = usedForPayment;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Boolean getInEea() {
		return inEea;
	}

	public void setInEea(Boolean inEea) {
		this.inEea = inEea;
	}
    
}
