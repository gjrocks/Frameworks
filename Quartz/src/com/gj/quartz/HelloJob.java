package com.gj.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {

System.out.println("hello ganesh");
    }

}
