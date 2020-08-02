/*
 * Copyright (c) 2008 Nick Allen.  All rights reserved.
 * Distribution and use of this source code (or the application compiled from this source code) 
 * and associated documentation ("Software"), with or without modification is prohibited.
 */
package com.gj.model;

import org.springframework.util.StringUtils;

/**
 * The different types of user roles
 */
public enum UserRoleType {

    ROLE_EBULK_ADMIN("E-Bulk Administrator"),
    ROLE_RB_ADMIN("RB Administrator"),
    ROLE_REPORT("Report Access"),
    
    ROLE_CERT_UPLOAD("Upload & View Content Certificate Access"),
    ROLE_CERT_VIEW("View Only Content Certificate Access"),
    
    ROLE_COUNTER_SIG("Countersignatory"),    
    ROLE_ID_CHECKER("ID Checker"),
    ROLE_ORG_USER("Applicant Manager"),    
    ROLE_ORG_SUPERUSER("Primary Applicant Manager"),   
    ROLE_APPLICANT("Applicant"), 
    ROLE_UPDATE_SERVICE_EDIT("Edit & View Update Service Access"),
    ROLE_UPDATE_SERVICE_VIEW("View Only Update Service Access");
    
    private String description;
    
    private UserRoleType(String s) {
        description = s;
    }
    
    public static UserRoleType getType(String name) {    
       if (StringUtils.hasText(name)) {
           name = name.toUpperCase();
           try {
                return UserRoleType.valueOf(name);
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
    
    
}
