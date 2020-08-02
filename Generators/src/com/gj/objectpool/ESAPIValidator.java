package com.gj.objectpool;

import org.owasp.esapi.ESAPI;

public class ESAPIValidator {

	org.owasp.esapi.Validator validator;
    Boolean inUse;
    
	public void setValidator(org.owasp.esapi.Validator validator) {
		this.validator = validator;
	}

	public ESAPIValidator() {
		validator = ESAPI.validator();
		inUse=false;
	}

	public synchronized Boolean getInUse() {
		return inUse;
	}

	public synchronized  void setInUse(Boolean inUse) {
		this.inUse = inUse;
	}

	public org.owasp.esapi.Validator getValidator() {
		return validator;
	}
}
