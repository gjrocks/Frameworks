package com.gj;

import java.io.IOException;
import java.util.Queue;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.listeners.Job;

@WebServlet(name="longRun",
        urlPatterns={"/longrun"},
        asyncSupported=true
)

public class LongRunAsyncServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     System.out.println("Started async in Thread :" +Thread.currentThread().getName());
		
        req.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
		AsyncContext asyncContext=req.startAsync(req, resp);
		//u can change Job and pass the request info this is simple example
		Job jb=new Job(asyncContext);
		Queue<Job> qu=(Queue<Job>)req.getServletContext().getAttribute("jobs");
		qu.offer(jb);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
