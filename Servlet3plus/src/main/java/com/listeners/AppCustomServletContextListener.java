package com.listeners;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppCustomServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent ctx) {
		Queue<Job> appJobs=new ConcurrentLinkedQueue<Job>();
		ExecutorService service=Executors.newFixedThreadPool(10);
		ExecutorService serviceMain=Executors.newSingleThreadExecutor();
		ctx.getServletContext().setAttribute("jobpool", service);
		ctx.getServletContext().setAttribute("jobs", appJobs);
		ctx.getServletContext().setAttribute("mainExecutor", serviceMain);
		serviceMain.execute(new Runnable() {
			
			@Override
			public void run() {
				
				while(true){
					
					if(!appJobs.isEmpty()){
						
						final Job jb=appJobs.remove();
						service.execute(jb);
						
					}
					
					
				}
				
				
			}
		});
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent ctx) {
		ExecutorService service=(ExecutorService)ctx.getServletContext().getAttribute("jobpool");
		if(service!=null) service.shutdown();
		
		ExecutorService serviceMain=(ExecutorService)ctx.getServletContext().getAttribute("mainExecutor");
		if(serviceMain!=null) serviceMain.shutdown();

	}

}
