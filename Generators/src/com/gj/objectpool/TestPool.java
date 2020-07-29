package com.gj.objectpool;

public class TestPool implements Runnable{

	public static ESAPIValidatorPool pool=new ESAPIValidatorPool(new ESAPIValidatorFactory());
	static{
		for(int i=0;i<10;i++){
			try{
				pool.addObject();
			}catch(Exception e){
				
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<40;i++){
			
			new Thread(new TestPool()).start();
			//Thread.sleep(500);
		}
		
	}

	@Override
	public void run() {
	try{
		
		ESAPIValidator validator=(ESAPIValidator)pool.borrowObject();
		validator.setInUse(true);
		System.out.println(validator.hashCode());
	    validator.setInUse(false);
		pool.returnObject(validator);
	}catch(Exception r){
		r.printStackTrace();
	}
	}

}
