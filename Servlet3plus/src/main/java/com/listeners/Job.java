package com.listeners;

import java.io.PrintWriter;

import javax.servlet.AsyncContext;

public class Job implements Runnable {

	private AsyncContext ctx;
	
	public Job(AsyncContext ctx){
		this.ctx=ctx;
	}
	@Override
	public void run() {
		try {
		  Thread.sleep(5000);
           System.out.println("Completed Processing in  Thread: " + Thread.currentThread().getName());
           PrintWriter out=ctx.getResponse().getWriter();
           out.println("Completed Task by  :" +Thread.currentThread().getName() );
           
		} catch (Exception e) {
			e.printStackTrace();
		}

		ctx.complete();
	}
	
	

}
