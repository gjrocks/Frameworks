package com.gj.concurrencies;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionDemo {

	
	private SharedResource box=new SharedResource();
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	//you can have separate read and write conditions
	public static void main(String[] args) throws Exception {
		LockConditionDemo demo=new LockConditionDemo();
		Runnable writer = () -> {

			try {
				demo.addWithConditionalLock(new Random().nextInt(1000));
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};

		Runnable reader = () -> {

			try {
				System.out.println("Value from box :" +demo.readWithConditionalLock());
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(reader,"reader");
		Thread t2 = new Thread(writer, "writer");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		//System.out.println("Final value :" +demo.getResource().getData());

	}

	
	
	public synchronized void add(int val) throws Exception{
		System.out.println("Came inside add"); 
		
		while(box.getData()!=null) {
			System.out.println("Came inside add wait"); 
			this.wait();
		}
		
			box.setData(val);
		   this.notifyAll();
	}
	
	public synchronized Integer read() throws Exception {
		System.out.println("Came inside read"); 
		Integer temp=null;
		while(box.getData()==null) {
			System.out.println("Came inside read wait"); 
			this.wait();
		}
			
		    temp=box.getData();
			box.setData(null);
		    this.notifyAll();
		return temp;
	}
	
	public  void addWithConditionalLock(int val) throws Exception{
		System.out.println("Came inside addWithConditionalLock"); 
		lock.lock();
		try {
		while(box.getData()!=null) {
			System.out.println("Came inside addWithConditionalLock wait"); 
			condition.await();
		}
		
			box.setData(val);
		  // this.notifyAll();
			condition.signalAll();
		}finally {
			lock.unlock();
		}
	}
	
	public  Integer readWithConditionalLock() throws Exception {
		System.out.println("Came inside readWithConditionalLock"); 
		Integer temp=null;
		lock.lock();
		try {
		while(box.getData()==null) {
			System.out.println("Came inside readWithConditionalLock wait"); 
			condition.await();
		}
			
		    temp=box.getData();
			box.setData(null);
		    //this.notifyAll();
			condition.signalAll();
		}finally {
			lock.unlock();
		}
		return temp;
	}
}
