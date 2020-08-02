package com.gj.simple;

public class ThreadRunnableExample {

	public static void main(String[] args){
		
		Thread t=new Thread(new MyRunable());
		t.start();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inner class version called");
				
			}
		});
		t1.start();
		
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
			System.out.println("Plain runnable version is called");
				
			}
		};
		
		r1.run();
		
		Runnable lambdaRunnable=()->{
			System.out.println("Lambda version is called");
		};
		
		lambdaRunnable.run();
		new Thread(lambdaRunnable).start();
	}
	
	
}

class MyRunable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunable run called");
		
	}
	
}