package com.gj.concurrencies;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	private SharedResource resource;
	private Lock lock=new ReentrantLock();
	
	public LockDemo() {
		
	}
    public SharedResource getResource() {
		return resource;
	}
	public void setResource(SharedResource resource) {
		this.resource = resource;
	}
	public LockDemo(SharedResource res) {
		this.resource=res;
	}
	
	public static void main(String[] args) throws Exception {
		LockDemo demo = new LockDemo(new SharedResource(0));
		Runnable r1 = () -> {

			try {
				demo.processData2();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(r1,"T1");
		t1.getState();
		Thread t2 = new Thread(r1, "T2");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final value :" +demo.getResource().getData());

	}
	
  public synchronized void processData() throws Exception{
		for(int i=0;i<10000;i++) {	
			this.getResource().defaultOperation();
		}
	}
	
  public  void processData2() throws Exception{
		lock.lock();
		System.out.println("Processing is done by thread : " +Thread.currentThread().getName());
	  try {
		  
	  for(int i=0;i<10000;i++) {	
			this.getResource().defaultOperation();
		}
	  }finally {
		  lock.unlock();
	  }
	  
	}
	
  
  public  void processData3() throws Exception{
		lock.lock();
	  try {
		  
	  for(int i=0;i<10000;i++) {	
			this.getResource().defaultOperation();
		}
	  }finally {
		  lock.unlock();
	  }
	  
	}
}
