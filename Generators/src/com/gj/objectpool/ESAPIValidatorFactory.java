package com.gj.objectpool;

import org.apache.commons.pool.PoolableObjectFactory;

public class ESAPIValidatorFactory implements PoolableObjectFactory{

	@Override
	public void activateObject(Object arg0) throws Exception {
	}

	@Override
	public void destroyObject(Object arg0) throws Exception {
	}

	@Override
	public Object makeObject() throws Exception {
	System.out.println("m called");
		return new ESAPIValidator();
	}

	@Override
	public void passivateObject(Object arg0) throws Exception {
	}

	@Override
	public boolean validateObject(Object arg0) {
		ESAPIValidator v=(ESAPIValidator)arg0;
		if(v.getInUse())
		return false;
		
		return true;
	}

}
