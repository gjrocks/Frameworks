package com.gj;

import java.util.EnumSet;
import java.util.Set;

import org.springframework.util.StringUtils;

/**
 * The available frequency
 */
public enum FrequencyType {
	ANNUALLY("Annually"),
	MONTHLY("Every Month"),	 
	MONTHLY2("Every 2 Months"),
	QUARTERLY("Every Quarter"),
	HALFYEARLY("Every 6 Months"),
	NINEMONTHLY("Every 9 Months")
    ;
/*
 * <!-- <option value="">--Select--</option> -->
							<!-- <option value="ANNUALLY">Annually</option>
							<option value="MONTHLY">Every Month</option>
							<option value="MONTHLY2">Every 2 Months</option>
							<option value="QUARTERLY">Every Quarter</option>
							<option value="HALFYEARLY">Every 6 Months</option>
							<option value="NINEMONTHLY">Every 9 Months</option> -->
 */
    private String description;

    private FrequencyType(String s) {
        description = s;
    }

    public static FrequencyType getType(String name) {
        if (StringUtils.hasText(name)) {
            name = name.toUpperCase();
            try {
                return FrequencyType.valueOf(name);
            } catch (IllegalArgumentException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public String getValue() {
        return this.toString();
    }

    public String getDescription() {
        return this.description;
    }
    
    public static Set<FrequencyType> getStageTypeSet(){
    	Set<FrequencyType> st=EnumSet.of(FrequencyType.ANNUALLY,FrequencyType.MONTHLY,FrequencyType.MONTHLY2,FrequencyType.QUARTERLY,FrequencyType.HALFYEARLY,FrequencyType.NINEMONTHLY);
    	return st;
    }
}
  
