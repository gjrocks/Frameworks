package com.gj.objectpool;

import org.apache.commons.pool.impl.GenericObjectPool;

public class ESAPIValidatorPool extends GenericObjectPool {

	public ESAPIValidatorPool(ESAPIValidatorFactory factory) {
		super(factory);
		this.setMaxIdle(2); // maximum idle threads
		this.setMaxActive(10); // maximum active threads.
		//this.setMinEvictableIdleTimeMillis(30000); // Evictor runs every 30
													// secs.
		this.setTestOnBorrow(true); // check if the thread is still valid
		
	}

	public ESAPIValidatorPool(ESAPIValidatorFactory factory, GenericObjectPool.Config config) {
		super(factory, config);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.commons.pool.ObjectPool#borrowObject()
	 */
	public Object borrowObject() throws Exception {
		return super.borrowObject();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.commons.pool.ObjectPool#returnObject(java.lang.Object)
	 */
	public void returnObject(Object obj) throws Exception {
		super.returnObject(obj);
	}

}
